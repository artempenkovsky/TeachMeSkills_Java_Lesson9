package by.teachmeskills.penkovsky.homework9;

import by.teachmeskills.penkovsky.homework9.util.ScannerArray;
import by.teachmeskills.penkovsky.homework9.util.StringUtils;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                """
                        Choose task:
                        2. isBlank
                        3. isRussian
                        4. Contains
                        5. parseInt
                        0. Exit"""
        );
        while (true) {
            System.out.println("Task number: ");
            int taskNumber = scanner.nextInt();
            switch (taskNumber) {
                case 2 -> {
                    System.out.println("Введите строковые данные: ");
                    char[] array = ScannerArray.getNewArray();
                    System.out.print("Строка пустая?: ");
                    System.out.println(StringUtils.isBlank(array));
                }
                case 3 -> {
                    System.out.println("Введите данные: ");
                    char[] array = ScannerArray.getNewArray();
                    System.out.println("Введенные данные состоят из русского алфавита? - " + StringUtils.isRussian(array));
                }
                case 4 -> {
                    System.out.println("Введите первый массив: ");
                    char[] array1 = ScannerArray.getNewArray();
                    System.out.println("Ваши введенные данные: \n");
                    StringUtils.print(array1);

                    System.out.println("\nВведите второй массив: ");
                    char[] array2 = ScannerArray.getNewArray();
                    System.out.println("Ваши введенные данные: ");
                    StringUtils.print(array2);

                    boolean compare = StringUtils.contains(array1, array2);
                    if (compare) {
                        System.out.println("\nВторой массив является подмассивом первого.");
                    } else System.out.println("\nВторой массив не является подмассивом первого.");

                }
                case 5 -> {
                    System.out.println("Введите данные: ");
                    char[] array = ScannerArray.getNewArray();
                    System.out.println(StringUtils.parseInt(array));
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Введены некорректные данные");
            }
        }
    }
}


