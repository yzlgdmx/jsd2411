package day03;

public class IfDemo {
    public Gender gender = null;
    /**
     * 性别
     *
     * @int 你好
     * @object 你吃了吗
     */
    enum Gender {
        男,
        女,
        非二元性别,
        保密
    }

    public static void main(String[] args) {
        if (!true) return;
        else if (!false) System.out.println("success");
        else return;
        //  Gender gender = Gender.保密;
        //switch (gender) {
        IfDemo ifDemo = new IfDemo();
        switch (ifDemo.gender) {
            case 男:
                break;
            case 女:
                break;
            case 非二元性别:
                break;
            case 保密:
                break;
            default:
                break;

        }
    }
}
