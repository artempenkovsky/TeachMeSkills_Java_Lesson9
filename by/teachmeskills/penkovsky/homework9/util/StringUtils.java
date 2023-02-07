package by.teachmeskills.penkovsky.homework9.util;

public class StringUtils {
    public static void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void println(char[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
        System.out.print("\n");

    }

    public static boolean isBlank(char[] array) {
        if (array.length == 0)
            return true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ')
                return false;
        }
        return true;
    }

    public static boolean isRussian(char[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Вы ничего не ввели");
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 'а' && array[i] <= 'я') || (array[i] >= 'А' && array[i] <= 'Я') || (array[i] == 'ё')) { //&& array[i] == 'Ё')) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char[] secondArray) {
        if (secondArray.length > array.length) {
            throw new IllegalArgumentException("Введены неверные данные!");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int compare = 0;
            for (int j = 0; j < secondArray.length; j++) {
                if (array[i + j] != secondArray[j])
                    break;
                else {
                    compare++;
                }
                if (compare == secondArray.length)
                    return true;
            }
        }
        return false;
    }
}

