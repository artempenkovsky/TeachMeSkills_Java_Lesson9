package by.teachmeskills.penkovsky.homework9.util;

public class StringUtils {
    public static void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void println(char[] array) {
        print(array);
        System.out.println();
    }

    public static boolean isBlank(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!Character.isWhitespace(array[i])) {
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
        for (char ch : array) {
            if ((ch < 'А' || ch > 'Я') && (ch < 'а' || ch > 'я') && (ch != 'ё' && ch != 'Ë')) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(char[] array, char[] secondArray) {
        if (secondArray.length > array.length) {
            return false;
        }
        for (int i = 0; i <= array.length - secondArray.length; i++) {
            boolean equal = true;
            for (int j = 0; j < secondArray.length; j++) {
                if (array[i + j] != secondArray[j]) {
                    equal = false;
                    break;
                }
            }
            if (equal) return true;
        }
        return false;
    }

    public static int parseInt(char[] array) {
        int result = 0;
        int degree = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i] - '0';
            if (tmp < 0 || tmp > 9) {
                throw new IllegalArgumentException("Проверьте введенные данные!");
            }
            result += tmp * Math.pow(10, degree);
            degree--;
        }
        return result;
    }
}

