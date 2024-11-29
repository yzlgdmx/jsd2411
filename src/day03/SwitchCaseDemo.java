package day03;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        IfDemo ifDemo = new IfDemo();
        ifDemo.gender = IfDemo.Gender.保密;
        switch (ifDemo.gender) {
            case 男:
                System.out.println("男");
                break;
            case 女:
                System.out.println("女");
                break;
            case 非二元性别:
                System.out.println("非二元性别");
                break;
            case 保密:
                System.out.println("保密");
                break;
            default:
                System.out.println("你怎么走到这的?");
                break;
        }
    }
}
