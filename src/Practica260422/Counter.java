package Practica260422;

public class Counter {
    private int count;

    public void increment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {}
        count++;
    }

    public int getCount() {
        return count;
    }
}
