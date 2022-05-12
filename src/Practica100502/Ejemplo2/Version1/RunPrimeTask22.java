package Practica100502.Ejemplo2.Version1;

import java.util.ArrayList;
import java.util.List;

public class RunPrimeTask22 {
    public static void main(String[] args) throws InterruptedException {
        var nums = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11);
        List<PrimeTask21> threads = new ArrayList<>();

        for(var num : nums) {
            PrimeTask21 primeTask21 = new PrimeTask21(num);
            primeTask21.start();
            threads.add(primeTask21);
        }
        waitingThreads(threads);
        System.out.println("Fin");
        System.out.println(threads.stream().filter(PrimeTask21::isPrime).count());

    }

    public static void waitingThreads(List<PrimeTask21> threads) throws InterruptedException {
        for (var t : threads) {
            t.join();
        }
    }
}
