import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class BigIntegerCustom {

    private ArrayList<Integer> digits;

    public BigIntegerCustom(String dig) {
        for (int i = 0; i < dig.length(); i++) {
            if (Character.isLetter(dig.charAt(i))) {
                throw new IllegalArgumentException("There is a letter in the digit " + dig.charAt(i));
            }
        }

        dig = dig.replaceAll(" ", "");

        while (dig.charAt(0) == '0' && dig.length() > 1) {
            dig = dig.replaceFirst("0", "");
        }

        digits = new ArrayList<>();

        for (int i = 0; i < dig.length(); i++) {
            digits.add(dig.charAt(i) - '0');
        }
    }

    public ArrayList<Integer> getDigits() {
        return this.digits;
    }

    public static ArrayList<Integer> addBigInt(BigIntegerCustom bigInt1, BigIntegerCustom bigInt2) {
        ArrayList<Integer> a = bigInt1.getDigits();
        ArrayList<Integer> b = bigInt2.getDigits();
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0;

        int maxLength = Math.max(a.size(), b.size());
        while (a.size() < maxLength) {
            a.add(0, 0);
        }
        while (b.size() < maxLength) {
            b.add(0, 0);
        }

        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = a.get(i) + b.get(i) + carry;
            carry = sum / 10;
            res.add(sum % 10);
        }

        if (carry != 0) {
            res.add(carry);
        }

        Collections.reverse(res);
        return res;
    }

    public static ArrayList<Integer> subtractBigInt(BigIntegerCustom bigInt1, BigIntegerCustom bigInt2) {
        ArrayList<Integer> a = bigInt1.getDigits();
        ArrayList<Integer> b = bigInt2.getDigits();
        ArrayList<Integer> res = new ArrayList<>();
        int borrow = 0;

        int maxLength = Math.max(a.size(), b.size());
        while (a.size() < maxLength) {
            a.add(0, 0);
        }
        while (b.size() < maxLength) {
            b.add(0, 0);
        }

        for (int i = maxLength - 1; i >= 0; i--) {
            int diff = a.get(i) - b.get(i) - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            res.add(diff);
        }

        while (res.size() > 1 && res.get(res.size() - 1) == 0) {
            res.remove(res.size() - 1);
        }

        Collections.reverse(res);
        return res;
    }

    public static ArrayList<Integer> multiplyBigInt(BigIntegerCustom bigInt1, BigIntegerCustom bigInt2) {
        ArrayList<Integer> a = bigInt1.getDigits();
        ArrayList<Integer> b = bigInt2.getDigits();
        Collections.reverse(a);
        Collections.reverse(b);

        int[] result = new int[a.size() + b.size()];

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                result[i + j] += a.get(i) * b.get(j);
                result[i + j + 1] += result[i + j] / 10;
                result[i + j] %= 10;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int num : result) {
            res.add(num);
        }

        while (res.size() > 1 && res.get(res.size() - 1) == 0) {
            res.remove(res.size() - 1);
        }

        Collections.reverse(res);
        return res;
    }

    public static ArrayList<Integer> divideBigInt(BigIntegerCustom bigInt1, BigIntegerCustom bigInt2) {
        BigInteger a = new BigInteger(bigInt1.toString());
        BigInteger b = new BigInteger(bigInt2.toString());

        BigInteger result = a.divide(b);

        ArrayList<Integer> res = new ArrayList<>();
        for (char c : result.toString().toCharArray()) {
            res.add(c - '0');
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            BigIntegerCustom bigint1 = new BigIntegerCustom("10000");
            BigIntegerCustom bigint2 = new BigIntegerCustom("100");

            System.out.println("plus: " + BigIntegerCustom.addBigInt(bigint1, bigint2));
            System.out.println("minus: " + BigIntegerCustom.subtractBigInt(bigint1, bigint2));
            System.out.println("multiplication: " + BigIntegerCustom.multiplyBigInt(bigint1, bigint2));
            System.out.println("division: " + BigIntegerCustom.divideBigInt(bigint1, bigint2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
