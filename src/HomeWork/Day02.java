package HomeWork;

public class Day02 {
    public static void main(String[] args) {

        //region 1. 变量的练习：
        //
        //   - 声明一个变量，一次声明多个变量。
        //   - 声明变量直接初始化，先声明变量，而后再给变量初始化。
        //   - 声明整型变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值。
        //
        //   - 在g本身基础之上增10，输出变量g的值。
        //   - 声明一些正确的和错误的变量名。

      /*  int num1, num2, num3;
        int num4 = 1;
        int num5;
        num5 = 1;
        int g = 1;
        int h =g+10;
        System.out.println(h);*/
        //endregion

        //region 2. 基本数据类型的练习：int
        //
        //   - 声明初始化两个以上整数变量，并且输出两个整数变量的除法结果
        //   - 声明两个很大的变量，然后相加，输出运算结果，测试运算溢出现象
       /* int num1 = 7, num2 = 2;
        System.out.println(num1 / num2);
        int num3 = Integer.MAX_VALUE, num4 = 1;
        System.out.println(num3 + num4);*/
        //endregion

        //region 3. 基本数据类型的练习：long
        //
        //   - 声明初始化两个以上的长整型变量
        //   - 声明变量存储几个较大数据的运算，演示：若有可能溢出建议将L设计在第1个数字后。
       /* long long1 = 1L, long2 = 2L;
        long long3 = 2000000000L * 3 * 5;*/
        //endregion

        //region 4. 基本数据类型的练习：double
        //
        //   - 声明初始化两个以上的浮点型变量
        //   - 声明几个浮点型变量并将它们做数学操作，演示double运算的舍入误差问题
       /* double d1 = 0.2, d2 = 0.1;
        String str = String.format("%G17", d1 + d2);
        System.out.println(d1 + d2);
        //System.out.println(str);*/
        //endregion

        //region 5. 基本数据类型的练习：boolean
        //
        //   - 声明初始化两个以上的布尔型变量
/*        boolean b1 = false, b2 = true;
        boolean b3 =  200 > 300 ? true : false;*/
        //endregion

        //region 6. 基本数据类型的练习：char
        //
        //   - 声明初始化五个以上的字符型变量
        //   - 声明字符型变量，演示转义符
/*        char c1 = '1', c2 = 22, c3 = '好', c4 = 'A', c5 = '\\';*/
        //endregion

        //region 7. 基本数据类型的转换：两种方式
        //
        //   - 声明几个变量，演示自动类型转换和强制类型转换的语法
        //   - 声明一个较大类型的长整型变量，演示强转可能会发生的溢出问题
        //   - 声明一个较大精度的浮点型变量，演示强转可能会发生的丢失精度问题
/*        int num1 = 1;
        double d1 = num1 + 1.1;
        int num2 = (int) Long.MAX_VALUE;
        double d2 = 3.141592653;
        int num3 = (int) d2;*/
        //endregion

        //region 8. 基本数据类型的转换：两点规则
        //
        //   - 声明两个byte型变量b1和b2，并赋值为直接量
        //   - 声明一个byte型变量，并赋值为b1与b2的和
/*        byte b1 = 1, b2 = 2;
        byte b3 = (byte) (b1 + b2);*/
        //endregion
    }
}
