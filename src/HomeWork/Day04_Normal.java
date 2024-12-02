package HomeWork;

import java.text.MessageFormat;
import java.util.Scanner;

public class Day04_Normal {
    public static void main(String[] args) {
        //GuessingNum();
        //ForTest();
        //MultiplicationTable();
        ArrayTest();
    }

    /**
     * 1. Guessing猜数字之while版：
     * <p>
     * 要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用while来实现。
     */
    public static void GuessingNum() {
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
    }

    /**
     * 2. for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9)、累加1到100的和
     */
    public static void ForTest() {
        for (int i = 0; i < 5; i++) System.out.println("行动是成功的阶梯");

        for (int i = 1; i < 10; i++) System.out.print(MessageFormat.format("{0}x9={1}\t", i, i * 9));
        System.out.println();
        for (int i = 1; i < 10; i += 2) System.out.print(MessageFormat.format("{0}x9={1}\t", i, i * 9));
        System.out.println();

        int tmp = 0;
        for (int i = 1; i < 101; i++) {
            tmp += i;
        }
        System.out.println(tmp);
    }

    /**
     * 3. MultiTable九九乘法表
     * <p>
     * 要求：输出九九乘法表
     */
    public static void MultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(MessageFormat.format("{0}x{1}={2}\t", j, i, i * j));
            }
            System.out.println();
        }
    }

    /**
     * 4. 数组小代码练习：声明、初始化
     */
    public static void ArrayTest() {
        int[] nums = {3, 1, 4};
        int[] nums2 = new int[64];
        int[] nums3 = new int[]{2, 3, 3};
        //foreach
        for (var item : nums) {
            System.out.println(item);
        }
    }
}
