package ooday01;

/**
 * 学生类
 */
public class Student extends Person {
    String className;
    String stuId;

    Student() {
    }

    Student(String name, int age, String address, String className, String stuId) {
        super(name, age, address);
        this.className = className;
        this.stuId = stuId;
    }

    void study() {
        System.out.println(name + "正在学习...");
    }
}


























