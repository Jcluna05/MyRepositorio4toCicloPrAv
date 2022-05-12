package Practica260422;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Candado {
    private static int count = 0;
    private Lock counterLock;

    public Candado() { counterLock = new ReentrantLock();}

    public void increment() {
        counterLock.lock();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        try {
            count++;
        } finally {
            counterLock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
