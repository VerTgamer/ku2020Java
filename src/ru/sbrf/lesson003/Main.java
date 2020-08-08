package ru.sbrf.lesson003;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        a += 1;
        System.out.println(a + " " + ++a + " " + a + " " + a++ + " " + a);

        System.out.println(sumByteShort((byte) 1, (short) 2));
        System.out.println(multIntLong(2,4));
        System.out.println(getMaxNumber(1,2));
        System.out.println(isCharA('A'));
        System.out.println(isCharNumber('1'));
        cycleBin();
        overflowBin();
        System.out.println(codeChar('a'));
        System.out.println(deCodeChar(97));
    }

    public static byte sumByteShort(byte oneParam, short twoParam) {
        return (byte) (oneParam + twoParam);
    }

    public static int multIntLong(int oneParam, long twoParam) {
        return (int) (oneParam * twoParam);
    }

    public static int getMaxNumber(int oneParam, int twoParam) {
        int max = oneParam;
        if (oneParam < twoParam) {
            max = twoParam;
        }
        return max;
    }

    public static boolean isCharA(char param) {
        boolean result = false;
        if (param == 'A') {
            result = true;
        }
        return result;
    }

    public static boolean isCharNumber(char param) {
        boolean result = false;
        if (Character.isDigit(param)) {
            result = true;
        }
        return result;
    }

    public static void cycleBin() {
        for (int i = 0; i <= 30; i++) {
            System.out.print(Integer.toBinaryString(i) + " ");
        }
        System.out.println();
    }

    public static void overflowBin() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int codeChar(char param) {
        int code = param;
        return code;
    }

    public static char deCodeChar(int param) {
        char deCode = (char) param;
        return deCode;
    }
}
