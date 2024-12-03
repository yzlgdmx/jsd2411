package day04;

public class ContinueDemo {
    public static void main(String[] args) {
        int nextLine = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 7 != 0) continue;
            System.out.print(i + "\t");
            nextLine += 1;
            if (nextLine == 20) {
                nextLine = 0;
                System.out.println();
            }
        }
        int nextLine2 = 0;
        for (int i = 0; i < 1000; i++) {
            //if ()


            System.out.print(i + "\t");
            nextLine2 += 1;
            if (nextLine2 == 20) {
                nextLine2 = 0;
                System.out.println();
            }
        }
        GetDigits(99999);
        int[] nums = new int[10];
        extractDigitsToArray(1234567, nums);
        for (int i = 0; i < nums.length; i++) System.out.print(nums[i] + "\t");
    }


    public static void GetDigits(int num) {
        if (num < 0) {
            System.out.println("请输入正整数");
            return;
        }
        if (num >= 10) {
            GetDigits(num / 10);
        }
        System.out.println(num % 10);
    }

    public static int extractDigitsToArray(int num, int[] digits) {
        if (num < 0) {
            num = -num; // Convert negative number to positive
        }
        int index = 0;
        if (num == 0) {
            digits[index++] = 0;
            return index;
        }
        while (num > 0) {
            digits[index++] = num % 10; // Extract the last digit
            num /= 10; // Remove the last digit
        }
        // Reverse the array to get the correct order
        for (int i = 0; i < index / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[index - 1 - i];
            digits[index - 1 - i] = temp;
        }
        return index;
    }
}
