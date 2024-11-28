package day02;

/**
 * long类型的演示
 */
public class LongDemo {
    public static void main(String[] args) {
        long largeNum = 111L;
        String str =  Long.toString(largeNum);

        System.out.println(Long.MAX_VALUE-largeNum);
    }
}
