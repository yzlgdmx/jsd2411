package HomeWork;

public class Day05_Extensions {
    public static void main(String[] args) {
        System.out.println(GetMaxOfArray(new int[]{0, -999, 999}));

        PrintArrayData(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println();


    }


    /**
     * 1. 定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法
     */
    public static int GetMaxOfArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result < nums[i]) result = nums[i];
        }
        return result;
    }

    /**
     * 2. 定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法
     */
    public static void PrintArrayData(int[] nums) {
        for (var item : nums) System.out.print(item + "\t");
    }
}
