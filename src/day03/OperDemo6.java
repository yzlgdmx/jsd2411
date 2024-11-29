package day03;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.*;

public class OperDemo6 {
    public static void main(String[] args) {
        System.out.println(!!(1 > 3) && Math.pow(2, 11) < 4 || 4 + 1 >= 3 ? 'A' + 'a' : false + "------asdfghjkl;");

        Function<Integer, Object> myFunction1 = (x) -> {
            System.out.println("Function1 executed!");
            return x * x;

        };
        OperDemo6 operDemo6 = new OperDemo6();
        operDemo6.DelayFunction(2f, myFunction1, 5);

        Runnable myFunction2 = () -> {
            System.out.println("Function2 executed!");
        };
        operDemo6.DelayFunction(2f, myFunction2);

        operDemo6.DelayFunction(4f, () -> {
            System.out.println("Lambda executed!");
        });


    }


    public <T, R> void DelayFunction(float delayTime, Function<T, R> function, T input) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.schedule(() -> {
            R result = function.apply(input);
            System.out.println("Function executed before delay. Result: " + input);
            System.out.println("Function executed after delay. Result: " + result);
        }, (long) (delayTime * 1000), TimeUnit.MILLISECONDS);

        executor.shutdown();
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

