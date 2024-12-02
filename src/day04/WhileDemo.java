package day04;

import MyTool.SelfTool;

import java.text.MessageFormat;
import java.util.ArrayList;

public class WhileDemo {
    public static void main(String[] args) {
        int loopTime = 50;
        for (int i = 0; i < loopTime; i++)
            /*System.out.print("行动是成功的阶梯\t\t" + i + 1 + "\n")*/
            System.out.print(MessageFormat.format("行动是成功的阶梯\t第{0}次执行\n", i + 1));

        SelfTool.MultiplicationTable();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(9);
        nums.add(2);
        nums.add(6);
        nums.add(5);
        nums.add(3);
        int[] nums2 = {8, 6, 4, 9, 67, 99, 2, 233, 332, 1};
        SelfTool.BubbleSort(nums, SelfTool.Sort.从小到大);
        SelfTool.BubbleSort(nums, SelfTool.Sort.从大到小);

        SelfTool.BubbleSort(nums2, SelfTool.Sort.从小到大);
        SelfTool.BubbleSort(nums2, SelfTool.Sort.从大到小);
    }
}
