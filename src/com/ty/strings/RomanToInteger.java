package com.ty.strings;

/**
 * RomanToInteger
 */
public class RomanToInteger {

    public static int returnValue(char ch) {
        int value = 0;

        switch (ch) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                break;
        }
        return value;
    }

    public static int returnFinalValue(String str) {
        int result = 0;

        for (int cur = 0; cur < str.length(); cur++) {

            int currentValue = returnValue(str.charAt(cur));

            if (cur < str.length() - 1 &&
                    currentValue < returnValue(str.charAt(cur + 1))) {

                result -= currentValue;

            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "XXXI";
        int result = returnFinalValue(str);
        System.out.println(result);

    }
}