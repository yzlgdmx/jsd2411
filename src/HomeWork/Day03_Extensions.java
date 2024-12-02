package HomeWork;

import java.text.MessageFormat;
import java.util.Scanner;

public class Day03_Extensions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("59:");
//        Test3(59);
//        System.out.println("79:");
//        Test3(79);
//        System.out.println("89:");
//        Test3(89);
//        System.out.println("99:");
//        Test3(99);
//        System.out.println("请输入成绩:");
//        Test3(scanner.nextInt());

        Test4(1999, 6);
        System.out.println("请先输入年份,然后输入月份");
        Test4(scanner.nextInt(), scanner.nextInt());

    }


    /**
     * 1. 声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构。
     */
    public static void Test1() {
        int a = 10, b = 15;
        //条件运算符、if..else分支结构。
        if (a > b) System.out.println(a);
        else System.out.println(b);

        System.out.println(a > b ? a : b);
    }

    /**
     * 2. 声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"。
     * 闰年的判断公式:
     * 1)4年一闰，百年不闰，就是：能被4整除，并且，不能被100整除
     * 或者
     * 2)400年再闰，就是：能被400整除
     */
    public static boolean Test2(int year) {
        //if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) /*System.out.println("是闰年")*/ return true;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) /*System.out.println("是闰年")*/ return true;
        else /*System.out.println("不是闰年")*/return false;
    }

    /**
     * 3. 成绩等级判断：
     * <p>
     * > 注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"
     * <p>
     * ```java
     * A:成绩大于等于90
     * B:成绩大于等于80并且小于90
     * C:成绩大于等于60并且小于80
     * D:成绩小于60
     * ```
     */
    public static void Test3(int score) {
        if (score <= 100 && score >= 0) {
            if (score <= 90) {
                if (score <= 80) {
                    if (score <= 60) {
                        System.out.println("D:成绩小于60");
                    } else System.out.println("C:成绩大于等于60并且小于80");
                } else System.out.println("B:成绩大于等于80并且小于90");
            } else System.out.println("A:成绩大于等于90");
        } else System.out.println("成绩不合法!");
    }

    /**
     * 4. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
     */
    public static void Test4(int year, int month) {


        //YearMonth yearMonth = YearMonth.of(year, month);
        //System.out.println(MessageFormat.format("{0}年的第{1}个月有{2}天", year, month, yearMonth.lengthOfMonth()));




        switch (month) {
            //1 3 5 7 8 10 12  -------31 天
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(MessageFormat.format("{0}年的第{1}个月有{2}天", year, month, 31));
                break;
            //4 6 9 11 -------30天
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(MessageFormat.format("{0}年的第{1}个月有{2}天", year, month, 30));
                break;
            case 2:
                //判断平闰年 闰年29  平年28
                if (Test2(year)) System.out.println(MessageFormat.format("{0}年的第{1}个月有{2}天", year, month, 29));
                else System.out.println(MessageFormat.format("{0}年的第{1}个月有{2}天", year, month, 28));
                break;
        }
    }
}