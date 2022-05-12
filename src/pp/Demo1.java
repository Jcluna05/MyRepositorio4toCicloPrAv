package pp;

public class Demo1 {
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName()); // Indica el hilo principal
        //System.out.println(Runtime.getRuntime().availableProcessors()); // Indica el numero de Procesadores

        System.out.printf("%s - ejecutandose\n", Thread.currentThread().getName());
        //Creacion de 5 hilos
        for(var i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.printf("%s - ejecutandose\n", Thread.currentThread().getName());
            }).start();
        }
        System.out.printf("Fin del %s\n", Thread.currentThread().getName());

        HelloTread myThread = new HelloTread();
        myThread.start();
    }
}
