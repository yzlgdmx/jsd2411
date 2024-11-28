package day02;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(scanner.nextInt());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
