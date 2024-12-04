package ooday01;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car("宝马", 100000.00, "白色", 5);
        bmw.start();

        Car audi = new Car();
        audi.stop();
    }
}
