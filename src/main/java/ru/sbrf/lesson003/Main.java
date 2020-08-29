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
        return oneParam > twoParam ? oneParam : twoParam;
    }

    public static boolean isCharA(char param) {
        return param == 'A';
    }

    public static boolean isCharNumber(char param) {
        return Character.isDigit(param);
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
        return param;
    }

    public static char deCodeChar(int param) {
        return (char) param;
    }
}