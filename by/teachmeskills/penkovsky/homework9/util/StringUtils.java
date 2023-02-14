package by.teachmeskills.penkovsky.homework9.util;

public class StringUtils {
    public static void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void println(char[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println();
    }

    public static boolean isBlank(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!Character.isWhitespace(array[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char[] array) {
        //bolean isRussian = true;
        if (array.length == 0) {
            throw new IllegalArgumentException("Вы ничего не ввели");
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 'А' && array[i] <= 'я') || array[i] == 'ё' || array[i] == 'Ë') {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char[] secondArray) {
        if (secondArray.length > array.length) {
            return false;
        }
        for (int i = 0; i <= array.length - secondArray.length; i++) {
            boolean equal = true;
            for (int j = 0; j < secondArray.length; j++) {
                if (array[i+j] != secondArray[j]) {
                    equal = false;
                    break;
                }
            }
            if (equal) return true;
        }
        return false;
        }

    public static int parseInt (char[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (!Character.isDigit(array[i])) {
                throw new IllegalArgumentException("Проверьте введенные данные!");
            }
            int digit = array[i] - '0';
            result = result * 10 + digit;
        }
        return result;
        }
    }

