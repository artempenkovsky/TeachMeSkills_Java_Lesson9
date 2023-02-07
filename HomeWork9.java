import by.teachmeskills.penkovsky.homework9.util.ScannerArray;
import by.teachmeskills.penkovsky.homework9.util.StringUtils;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уважаемый пользователь, введите номер задачи согласно списку: ");
        System.out.println("Задача 2");
        System.out.println("Задача 3");
        System.out.println("Задача 4");


        int task = scanner.nextInt();
        if (task >= 1 && task <= 6) {
            switch (task) {
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
                    System.out.print("Ваши введенные данные: ");
                    StringUtils.println(array1);

                    System.out.println("Введите второй массив: ");
                    char[] array2 = ScannerArray.getNewArray();
                    System.out.print("Ваши введенные данные: ");
                    StringUtils.println(array2);

                    boolean compare = StringUtils.contains(array1, array2);
                    if (compare = true) {
                        System.out.println("Второй массив является подмассивом первого.");
                    } else System.out.println("Второй массив не является подмассивом первого.");

                }
                default -> System.out.println("Введены некорректные данные");
            }
        }
    }
}

