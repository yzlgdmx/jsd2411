package day03;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 命令解析程序
 */
public class CommandBySwitch {
    public static void main(String[] args) {
        BigDecimal Balance = new BigDecimal("0.00");
        Balance = BigDecimal.valueOf(233);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择功能:1.存款 2.取款 3.查询余额 4.退卡");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("请输入存款金额:");
                int tmp1 = scanner.nextInt();
                Balance = Balance.add(BigDecimal.valueOf(tmp1));
                System.out.println("您的存款金额为:" + tmp1);
                System.out.println("您当前余额为:" + Balance);
                break;
            case 2:
                System.out.println("请输入取款金额:");
                int tmp2 = scanner.nextInt();
                if (Balance.compareTo(BigDecimal.valueOf(tmp2)) == -1) {
                    System.out.println("余额不足");
                    break;
                }
                Balance = Balance.subtract(BigDecimal.valueOf(tmp2));
                System.out.println("您的取款金额为:" + tmp2);
                System.out.println("您当前余额为:" + Balance);
                break;
            case 3:
                System.out.println("您的余额为:" + Balance);
                break;
            case 4:
                System.out.println("是否确认退卡?1确认2取消");
                System.out.println(scanner.nextInt() == 1 ? "退卡成功!" : "成功取消退卡!");
                System.out.println();
                break;
            default:
                break;
        }

    }
}
