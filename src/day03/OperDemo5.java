package day03;

import java.text.MessageFormat;

/**字符串连接运算符的演示 */
public class OperDemo5 {
    public static void main(String[] args) {
    String str = null;
    String name = "123",age = "456";
        System.out.println(MessageFormat.format("大家好,我叫{0},今年{1}岁了",name,age));
    }
}
