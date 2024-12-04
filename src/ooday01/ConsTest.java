package ooday01;

import java.text.MessageFormat;

/**
 * 构造方法的演示
 */
public class ConsTest {
    public static void main(String[] args) {

    }
}

class Car2 {
    private String brand;
    private double price;
    private String color;
    private int capacity;

    Car2(String _brand, double _price, String _color, int _capacity) {
        brand = _brand;
        price = _price;
        color = _color;
        capacity = _capacity;
    }

    Car2() {

    }


    void start() {
        System.out.println(MessageFormat.format("{0}牌子的{1}颜色的{2}座的{3}$的车发动了", brand, color, capacity, price));
    }

    void run() {
        System.out.println(MessageFormat.format("{0}牌子的{1}颜色的{2}座的{3}块钱的车运行中", brand, color, capacity, price));
    }

    void stop() {
        System.out.println(MessageFormat.format("{0}牌子的{1}颜色的{2}座的{3}块钱的车停止了", brand, color, capacity, price));
    }
}