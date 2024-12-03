package HomeWork;

import java.lang.annotation.Retention;
import java.util.Arrays;
import java.util.Random;

public class Day05_Normal {
    public static void main(String[] args) {
        int[] nums = {3, 51, 299, 0, -199};
        //Test1();
        System.out.println(Test2_MaxOfArray(nums));

        int[] nums2 = GenerateArray(10, -100, 201);
        for (int i = 0; i < nums2.length; i++) System.out.print(nums2[i] + "\t");
        System.out.println();
        System.out.println(Test2_MaxOfArray(nums2));
    }

    /**
     * 1. 数组的练习：访问、遍历、复制
     */
    public static void Test1() {
        int[] nums = {1, 2, 3};
        System.out.println(nums[2]);

        for (var item : nums) System.out.println(item);

        int[] nums2 = Arrays.copyOf(nums, nums.length);
        for (var item : nums2) System.out.println(item);
    }

    /**
     * 2. MaxOfArray求数组元素最大值
     */
    public static int Test2_MaxOfArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result < nums[i]) result = nums[i];
        }
        return result;
    }

    /**
     * 3. 方法的练习：
     * - 要求：
     * - 定义say()无参无返回值方法，调用测试
     * - 定义say()有一个参无返回值方法，调用测试
     * - 定义say()有两个参无返回值的方法，调用测试
     * - 定义sum()两个参有返回值方法，调用测试
     * - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
     */
    public static void Say() {
    }

    public static void Say(int i) {
    }

    public static void Say(int i, int j) {
    }

    public static double Say(int i, double j) {
        return i * j;
    }

    public static int[] GenerateArray(int length, int minRandom, int maxRandom) {
        int[] results = new int[length];
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(maxRandom - minRandom) + minRandom;
        }
        return results;
    }
}
