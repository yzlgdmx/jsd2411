package day05;

import MyTool.SelfTool;

import java.sql.Ref;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = new int[32];
        nums[nums.length - 1] = 233;

        for (int i = 0; i < nums.length; i++) {
            // nums[i] = SelfTool.getRandomInt(0, 100);
            System.out.print(nums[i] + "\t");

            //1声明变量保存数据
//            int tmp = i + 1;
//            if (tmp != 0 && tmp % 10 == 0) System.out.println();

            //2直接使用数据
            boolean needLine = i + 1 != 0 && (i + 1) % 10 == 0;
            if (needLine) System.out.println();

            int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
            int[] nums3 = Arrays.copyOf(nums2, nums2.length);
            nums2 = Arrays.copyOf(nums2, nums2.length + 1);
            Object[] no = {1, "2", 0.01f, 0.02, SelfTool.Sort.从大到小};
        }
    }

    public void T(int i, Ref s) {

    }
}
