package HomeWork;
import MyTool.SelfTool;
import java.text.MessageFormat;

public class Day03_Normal {
    public static void main(String[] args) {
//        Test1();
//        Test2();
//        Test3();
//        Test4();
//        Test5();
//        Test6();
//        Test7(600, 99);
//        Test8(400, 999);
        SelfTool.MultiplicationTable();
    }

    /**
     * 1. 运算符的练习：算术
     * <p>
     * - 输出几个整数取模，验证结果
     * - 声明两个整型变量，演示单独使用时的自增和自减
     * - 声明几个整型变量，演示被使用时的自增和自减
     */
    public static void Test1() {
        System.out.println(5 % 2);
        System.out.println(6 % 2);
        System.out.println(2 % 5);
        int num1 = 1;
        num1 += 1;
        System.out.println(num1++);
        System.out.println(num1);
        int num2 = 2;
        num2 -= num2;
        System.out.println(--num2);
        System.out.println(num2--);
        System.out.println(num2);
    }

    /**
     * 2. 运算符的练习：关系
     * <p>
     * - 声明几个变量，演示最基本的>，<，>=，<=，==，!=操作
     * - 演示关系运算符和算术运算符联合使用的效果
     */
    public static void Test2() {
        System.out.println(1 + 1 > 2);
        System.out.println(1 - 1 < 2);
        System.out.println(Math.pow(2, 5) == 2);
        System.out.println(Math.pow(1, Integer.MAX_VALUE) != 2);
    }

    /**
     * 3. 运算符的练习：逻辑
     * <p>
     * - 声明三个整型变量，演示&&和||，演示!
     * - &&的演示要求：true+false、false+true、true+true、false+false
     * - ||的演示要求：true+false、false+true、true+true、false+false
     * - !的演示要求：true、false
     * - 演示短路&&与短路||
     */
    public static void Test3() {
        int a = 1, b = 2, c = 3;
        //&&的演示要求：true+false、false+true、true+true、false+false
        System.out.println(a == 1 && b != 2);
        System.out.println(a != 1 && b == 2);
        System.out.println(a == 1 && b == 2);
        System.out.println(a != 1 && b != 2);
        //||的演示要求：true+false、false+true、true+true、false+false
        System.out.println(a == 1 || b != 2);
        System.out.println(a != 1 || b == 2);
        System.out.println(a == 1 || b == 2);
        System.out.println(a != 1 || b != 2);
        //!的演示要求：true、false
        System.out.println(!(a == 1));
        System.out.println(!(a != 1));
        //演示短路&&与短路||
        System.out.println(a != 1 && b++ == 2);
        System.out.println(a == 1 || b++ != 2);
    }

    /**
     * 4. 运算符的练习：赋值
     * <p>
     * - 声明一个整型变量，演示扩展赋值+=、-=、*=、/=、%=的效果
     * - 声明short型变量s，演示简单赋值运算的自增10，演示扩展赋值运算的自增10
     */
    public static void Test4() {
        int num1 = 10;
        System.out.println(MessageFormat.format(" num1={0}", num1));
        System.out.println(MessageFormat.format(" num1+=1:{0}", num1 += 1));
        System.out.println(MessageFormat.format(" num1-=2:{0}", num1 -= 2));
        System.out.println(MessageFormat.format(" num1*=4:{0}", num1 *= 4));
        System.out.println(MessageFormat.format(" num1/=3:{0}", num1 /= 3));
        System.out.println(MessageFormat.format(" num1%=7:{0}", num1 %= 7));

        short s = 10;
        s += 10;
        s = (short) (s + 10);
        System.out.println(s);
    }

    /**
     * 5. 运算符的练习：字符串连接
     * <p>
     * - 声明整型变量age和字符串型变量name，输出字符串连接的结果
     * - 输出几个数据的拼接，演示字符串连接的同化作用
     */
    public static void Test5() {
        int age = 27;
        String name = "s1mple";

        System.out.println("age:" + age);
        System.out.println("name:" + name);
    }


    /**
     * 6. 运算符的练习：条件/三目
     * <p>
     * - 声明并初始化整型变量，使用条件运算符实现：若>0则给flag赋值为1，否则赋值为0
     * - 声明两个整型变量，使用条件运算符实现：求这两个变量的最大值
     */
    public static void Test6() {
        System.out.println(1 > 0 ? 1 : 0);

        int num1 = 5, num2 = -5;
        System.out.println(num1 > num2 ? num1 : num2);
    }

    /**
     * 7. 分支结构的练习：if
     * <p>
     * - 满500打8折
     * - 判断成绩是否合法
     */
    public static void Test7(int price, int score) {
        if (price >= 500) price *= 0.8;
        System.out.println(MessageFormat.format("price={0}", price));
      /*  if (score <= 100 && score >= 0) System.out.println("合法成绩");
        else System.out.println("不合法成绩");*/
        if (score <= 100) {
            if (score >= 0) {
                System.out.println("合法成绩");
            }
        }
        System.out.println("不合法成绩");
    }


    /**
     * 8. 分支结构的练习：if...else
     * <p>
     * - 满500打8折，不满500打9折
     * - 判断成绩合法还是不合法
     */
    public static void Test8(int price, int score) {

        if (price >= 500) price *= 0.8;
        else price *= 0.9;
        System.out.println(MessageFormat.format("price={0}", price));

        if (score <= 100 && score >= 0) System.out.println("合法成绩");
        else System.out.println("不合法成绩");
    }


}
