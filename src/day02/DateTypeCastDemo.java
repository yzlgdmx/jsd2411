package day02;

import javax.swing.plaf.synth.Region;

public class DateTypeCastDemo {
    Double d1 = 2.2;

    public static void main(String[] args) {
        //region myRegion1
        System.out.println(Integer.parseInt("123456"));

        byte a = 1, b = 2;
        byte c = (byte) (a + b);
        //endregion

        System.out.println(2 + 2);
        System.out.println(2 + '2');
        System.out.println('2' + '2');
        System.out.println('2');
    }

}
