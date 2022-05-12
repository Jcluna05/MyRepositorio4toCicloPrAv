package Practica260422;

public class RunSincronizacion {
    public static void main(String[] args) {
        var counter = new Sincronizacion();
        for(var i=0; i < 10; i++) {
            new Thread(() -> {
                counter.increment();
                System.out.printf("%d para hilo %s%n",
                        counter.getCount(),
                        Thread.currentThread().getName());
            }).start();
        }
    }
}
