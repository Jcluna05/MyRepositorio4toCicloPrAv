package Practica050522.ejer1.concurrente1;

public class TaskSumDiv implements Runnable {
    private int num;
    private boolean esPerfecto;

    public TaskSumDiv(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        var sum = 0;
        for (var div = 1; div <= num/2; div++) {
            if(num % div == 0) {
                sum += div;
            }
        }

        if(sum == num) {
            System.out.printf("%des PERFECTO%n", num);
        } else {
            System.out.println("NO PERFECTO");
        }
    }

    public boolean isEsPerfecto() {
        return esPerfecto;
    }


}
