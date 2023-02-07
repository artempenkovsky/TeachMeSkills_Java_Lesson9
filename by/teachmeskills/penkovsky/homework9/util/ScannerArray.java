package by.teachmeskills.penkovsky.homework9.util;

import java.util.Scanner;

public class ScannerArray {

    public static char[] getNewArray() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().toCharArray();
    }
}