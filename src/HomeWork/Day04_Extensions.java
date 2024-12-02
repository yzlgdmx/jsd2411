package HomeWork;

import day03.IfElseDemo;

public class Day04_Extensions {
    public static void main(String[] args) {
        //输出1900到2023年之间所有的闰年
        LeapYear(1900, 2023);
        SumOfEvenNum();
        //求8的阶乘，并输出
        System.out.println(FactorialOfNum(8));
        //打印10行星星
        StarTest(10);
    }

    /**
     * 1. 输出1900到2023年之间所有的闰年(每够10个年份，换一行)
     */
    public static void LeapYear(int minYear, int maxYear) {
        int nextLine = 0;
        for (int i = minYear; i <= maxYear; i++) {
            if (day03_Extensions.Test2(i)) {
                System.out.print(i + "\t");
                nextLine += 1;
                if (nextLine == 10) {
                    nextLine = 0;
                    System.out.println();
                }
            }
        }
    }

    /**
     * 2. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出
     */
    public static void SumOfEvenNum() {
        int tmp = 0;
        for (int i = 2; i <= 100; i += 2) {
            tmp += i;
        }
        System.out.println(tmp);
    }


    /**
     * 3. 利用for循环计算：求8的阶乘，并输出
     */
    public static int FactorialOfNum(int num) {
        int tmp = 1;
        for (int i = 1; i <= num; i++) {
            tmp *= i;
        }
        return tmp;
    }

    /**
     * 4. 利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：
     * <p>
     * java
     * <p>
     * *
     * **
     * ****
     * ******
     * ********
     * **********
     * ```
     */
    public static void StarTest(int length) {
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
