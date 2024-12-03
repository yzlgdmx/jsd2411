package day04;

public class BreakDemo {
    public static void main(String[] args) {
        outer://label
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < i; j++) {
                break outer;
            }
        }
    }
}
