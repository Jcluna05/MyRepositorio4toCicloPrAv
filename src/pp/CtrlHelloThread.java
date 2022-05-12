package pp;

public class CtrlHelloThread {
    public static void main(String[] args) {
        /*HelloTread myThread = new HelloTread();
        myThread.start();*/

        Thread thRunnable = new Thread(new HelloRunnable());
        thRunnable.start();
    }
}
