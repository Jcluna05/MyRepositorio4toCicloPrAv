package Practica;

public class MetodoParalelo extends Thread{

    int number;
    public MetodoParalelo(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if(number % 2 == 0) {
            System.out.println(String.format("El %d es par", number));
        }
    }


}

