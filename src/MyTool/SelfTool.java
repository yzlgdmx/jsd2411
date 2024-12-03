package MyTool;

import com.sun.source.util.JavacTask;
import netscape.javascript.JSObject;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SelfTool {

    public enum Sort {
        从小到大, 从大到小
    }

    public static void main(String[] args) {
        MultiplicationTable();

        outer:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                break outer;
            }
        }
        /*     ArrayList<Object> obj = new ArrayList<>();
        obj.add(1);
        obj.add("1");
        obj.add('a');
        obj.add(0.01f);
        obj.add(0.01);
        SelfTool selfTool = new SelfTool();
        obj.add(selfTool);
*/


    }

    /**
     * 九九 乘法表
     */
    public static void MultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(MessageFormat.format("{0}x{1}={2}\t", j, i, i * j));
            }
            System.out.println();
        }
    }

    /**
     * 冒泡排序 ArrayList
     */
    public static void BubbleSort(ArrayList<Integer> nums, Sort sort) {
       /* Collections.sort(nums);
        Collections.reverse(nums);*/
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {

                if (sort == Sort.从大到小 ? nums.get(i) < nums.get(j) : nums.get(i) > nums.get(j)) {
                    var tmp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, tmp);
                }
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();//换行
    }

    /**
     * 冒泡排序 int数组
     */
    public static void BubbleSort(int[] nums, Sort sort) {
       /* Collections.sort(nums);
        Collections.reverse(nums);*/
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (sort == Sort.从大到小 ? nums[i] < nums[j] : nums[i] > nums[j]) {
                    var tmp = nums[i];
//                    nums.get(i) = nums.get(j);
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();//换行
    }

    private static final Random random = new Random();

    /**
     * 生成 [min, max) 范围内的随机整数
     */
    public static int getRandomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    /**
     * 生成 [min, max) 范围内的随机浮点数
     */
    public static double getRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    /**
     * 延迟执行一个方法
     *
     * @float 延迟时间
     * @Runnable 执行方法
     */
    public void DelayFunction(float delayTime, Runnable function) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        executor.schedule(function, (long) (delayTime * 1000), TimeUnit.MILLISECONDS);

        executor.shutdown();
    }
}
