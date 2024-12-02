package day04;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targerNum = 300;
        System.out.println("猜数字大小");
        while (true) {
            int tmp = scanner.nextInt();
            if (tmp < targerNum) {
                System.out.println("猜小了");
            } else if (tmp > targerNum) {
                System.out.println("猜大了");
            } else if (tmp == targerNum) {
                System.out.println("猜对了,程序退出");
                break;
            }
        }
       /* int tmp = 0;
        while (tmp != targerNum) {
            tmp = scanner.nextInt();
            if (tmp < targerNum) System.out.println("猜小了");
            else if (tmp > targerNum) System.out.println("猜大了");
        }*/
        System.out.println("猜对了,程序退出");


        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(0, 101));
        }
    }
}
