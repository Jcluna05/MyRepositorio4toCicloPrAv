package pp;

public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        var helloMess = String.format("Hola, soy %s\n", Thread.currentThread().getName());
        System.out.println(helloMess);
    }
}
