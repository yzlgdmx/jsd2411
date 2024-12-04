package HomeWork;

import java.text.MessageFormat;

public class OODay01 {
    public static void main(String[] args) {

    }
}


//region 1. Car类和CarTest类：
//
//   - Car类：brand、color、price、capacity、构造方法()、start()、run()、stop()
class Car {
    //region My Region2
    String brand;
    String color;
    double price;
    int capacity;

    Car() {

    }

    Car(String _brand, String _color, double _price, int _capacity) {
        brand = _brand;
        color = _color;
        price = _price;
        capacity = _capacity;
    }

    void start() {
        System.out.println(MessageFormat.format("({0})牌子的({1})颜色的({2})$的({3})座车正在启动", brand, color, price, capacity));
    }

    void run() {
        System.out.println(MessageFormat.format("({0})牌子的({1})颜色的({2})$的({3})座车正在启动", brand, color, price, capacity));
    }

    void stop() {
        System.out.println(MessageFormat.format("({0})牌子的({1})颜色的({2})$的({3})座车正在启动", brand, color, price, capacity));
    }
    //endregion
}

//   - CarTest类：创建对象，访问测试
class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "白色", 100000, 7);
        bmw.start();
        bmw.run();
        bmw.stop();
    }
}
//endregion


//2. Person、Student、Teacher、Doctor类和ExtendsTest类
//   - Person类：name、age、address、Person()、Person(参)、eat()、sleep()，sayHi()
abstract class Person {
    String name;
    int age;
    String address;

    Person() {

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void Eat() {
        System.out.println(MessageFormat.format("{0}正在吃东西", name));
    }

    void Sleep() {
        System.out.println(MessageFormat.format("{0}正在睡觉", name));
    }

    abstract void SayHi();

}

//   - Student类：继承Person、className、stuId，Student()、Student(参)、study()
class Student extends Person {

    String className;
    String stuID;

    public Student() {
    }

    public Student(String className, String stuID) {
        this.className = className;
        this.stuID = stuID;
    }

    public Student(String name, int age, String address, String className, String stuID) {
        super(name, age, address);
        this.className = className;
        this.stuID = stuID;
    }

    @Override
    void SayHi() {
        System.out.println(MessageFormat.format("这是学生的你好:{0}正在学习!", name));
    }

    void Study() {

    }
}

//   - Teacher类：继承Person、salary，Teacher()、Teacher(参)、teach()
class Teacher extends Person {

    int salary;

    public Teacher() {
    }

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    void SayHi() {
        System.out.println(MessageFormat.format("这是教师的你好:{0}正在给学生上课!", name));
    }

    void teach() {
        System.out.println("教师进行讲课");
    }
}


//   - Doctor类：继承Person、title，Doctor()、Doctor(参)、cut()
class Doctor extends Person {
    String title;

    Doctor() {

    }

    public Doctor(String title) {
        this.title = title;
    }

    public Doctor(String name, int age, String address, String title) {
        super(name, age, address);
        this.title = title;
    }

    @Override
    void SayHi() {
        //System.out.println("这是医生的你好:你要看病吗?");
        System.out.println(MessageFormat.format("这是医生的你好:{0}问:你要看病吗?", name));
    }

    void cut() {
        System.out.println("医生正在做手术");
    }
}


//   - ExtendsTest：创建对象、调用方法测试
class ExtendsTest {
    public static void main(String[] args) {
        Teacher tch1 = new Teacher("张三", 40, "Canada", 9000);
        Student stu1 = new Student("李四", 18, "河北", "三年级八班", "190403227");
        Doctor doc1 = new Doctor("王五", 55, "广东", "精神科主任");

        tch1.Eat();
        tch1.Sleep();
        tch1.SayHi();
        tch1.teach();

        stu1.Eat();
        stu1.Sleep();
        stu1.SayHi();
        stu1.Study();

        doc1.Eat();
        doc1.Sleep();
        doc1.SayHi();
        doc1.cut();
    }
}





















