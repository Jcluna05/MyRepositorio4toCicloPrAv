package Practica100502.Ejemplo2.Version1;

import java.util.stream.IntStream;

public class PrimeTask21 implements Runnable {
    private int number;
    private boolean isPrime;

    public PrimeTask21(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        isPrime = IntStream.range(2, number).noneMatch(div -> number % div == 0);
    }

    public boolean isPrime() {
        return isPrime;
    }

}
