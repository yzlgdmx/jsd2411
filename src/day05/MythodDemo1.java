package day05;

public class MythodDemo1 {
    public static void main(String[] args) {
        MythodDemo1 mythodDemo1 = new MythodDemo1();
        mythodDemo1.Say();
        System.out.println(mythodDemo1.Add(1, 2));
        System.out.println(MythodDemo2.AddSum(100));
    }


    public void Say() {
        System.out.println("success");
    }

    private int Add(int a, int b) {
        return a + b;
    }


}
