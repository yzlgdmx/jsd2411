package day01;

public class HelloWorld {
    public String str2 = "233";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(233);
        String str = "这是一个字符串";
        System.out.println(str);
        System.out.println(false);
        enum task {
            你好,
            w,
            sd,
            sd2
        }
        System.out.println(task.你好);
        HelloWorld s = new HelloWorld();
        System.out.println(s.str2);
    }
}
