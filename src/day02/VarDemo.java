package day02;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class VarDemo {
    public static void main(String[] args) {
        int a, b, c;
        for (int i = 0; i < 10; i++) {
            if (i == 5) ;//return i;
        }
        int i = 1;
        i = 2;
        String str = "null";
        System.out.println(str);
        //Decimal
        //int64
        //bool
        boolean bool1 = false;
        ArrayList</*int*/Integer> list1 = new ArrayList<>();
        //foreach(var item in list1)
        //  return 0;
        switch (str) {
            case "":
                break;
            default:
                break;
        }
       /* while (true) {
            if (false) break;
            return;
        }*/
//        String message = String.format("在{0}年，你好，{1}！", 2024, "世界");
        // 使用 MessageFormat.format 方法
        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        numberFormat.setGroupingUsed(false); // 禁用千位分隔符
        String message = MessageFormat.format("In{0}，Hello，{1}！", numberFormat.format(2024), "World");
        System.out.println(message);

        System.out.println(Function1(5, 3));//2
        var var1 = Function1(233, 7);
        //console.writeLine
        float f1 = 1.1F;
        double d1 = 0.2333;
    }

    /**
     * 输入一个int
     *
     * @return 返回一个char
     */
    public char Action1(int i) {
        char c = 'a';
        return c;
    }

    /**
     * 计算两个值的余数
     *
     * @param num1 第一个数
     * @param num2 第二个数
     * @return 返回两个数的余数
     */
    public static int Function1(int num1, int num2) {
        return num1 % num2;
    }

}

