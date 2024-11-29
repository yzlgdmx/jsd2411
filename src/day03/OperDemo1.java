package day03;
import java.text.MessageFormat;


/**
 * 判断运算符号
 */
enum Operation {
    加, 减, 乘, 除, 余
}

/**
 * 算术运算符的演示
 */
@FunctionalInterface//一个函数式接口只能有一个抽象方法
interface/*接口*/ MyFunction {
    //抽象方法
    int apply(int x, int y);

    //静态方法,不属于抽象方法,可以重载
    static double apply(double x, double y, Operation operation) {
        switch (operation) {
            case 加:
                return x + y;
            case 减:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            case 余:
                return x % y;
        }
        return x + y;
    }

    //默认方法,不属于抽象方法,可以重载
    //Java不允许在同一个类中定义两个具有相同签名的方法，即使是抽象方法和默认方法
    default long applyDefault(long x, long y, Operation operation) {
        switch (operation) {
            case 加:
                return x + y;
            case 减:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            case 余:
                return x % y;
        }
        return x + y;
    }
}

public class OperDemo1 {
    public static void main(String[] args) {
        System.out.println();

       /* int a = 1, b = 1;
        int c = a++;
        int d = ++b;
        System.out.println(MessageFormat.format("a的值为:{0}\nb的值为:{1}\nc的值为:{2}\nd的值为:{3}", a, b, c, d));*/

        int a = 1, b = 1;
        int c = a--;
        int d = --b;
        System.out.println(MessageFormat.format("a的值为:{0}\nb的值为:{1}\nc的值为:{2}\nd的值为:{3}", a, b, c, d));

        MyFunction add = (x, y) -> x + y;
        System.out.println(add.apply(a++, ++b));//调用抽象方法
        System.out.println(MyFunction.apply(1.1, 2.2, Operation.加));//调用静态方法
        System.out.println(add.applyDefault(++a, b++, Operation.加));//调用默认方法
    }
}
