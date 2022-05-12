package Practica100502.Ejemplo2.Version2;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class PrimeTask221 implements Runnable {
    private int number;
    private CountDownLatch endController;

    public PrimeTask221(int number, CountDownLatch endController) {
        this.number = number;
        this.endController = endController;
    }

    @Override
    public void run() {
        if(IntStream.range(2, number).anyMatch(div -> number % div == 0)) {
            System.out.printf("%d NO es primo %n", number);
        } else {
            System.out.printf("%d SI es primo %n", number);
        }
        endController.countDown();
    }
}
