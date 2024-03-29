package Practica100502.Ejemplo2.Version2;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RunTaskPrime222 {
    public static void main(String[] args) throws InterruptedException {
        var nums = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11, 31, 89, 103);

        var numCores = Runtime.getRuntime().availableProcessors();
        CountDownLatch endController = new CountDownLatch(nums.size());

        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);

        for(var num : nums) {
            executor.execute(new PrimeTask221(num, endController));
        }

        endController.await();
        System.out.println("Fin");
        executor.shutdown();
    }
}
