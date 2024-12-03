package day05;

import MyTool.SelfTool;

import java.sql.Ref;
import java.util.Random;

public class MythodDemo2 {
    public static void main(String[] args) {
        int[] nums = GenerateArray(10, 0, 100);
    }

    public static int AddSum(int num) {
        if (num == 1) return num;
        else return num + AddSum(num - 1);
    }

    /**
     * 生成一个整数类型数组,填充随机数据并返回
     */
    public static int[] GenerateArray(int length, int minRandom, int maxRandom) {
        int[] nums = new int[length];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(maxRandom - minRandom) + minRandom;
        }
        return nums;
    }
}

class Player {

}

class User1 extends Player implements Weapon, Equip {

}

interface Weapon {
    public static void mythod1() {
    }
}

interface Equip {
}