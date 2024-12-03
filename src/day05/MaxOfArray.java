package day05;

import MyTool.SelfTool;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] nums = new int[10];
        //nums[nums.length - 1] = 233;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = SelfTool.getRandomInt(0, 100);
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
