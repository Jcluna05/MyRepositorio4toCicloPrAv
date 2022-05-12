package Practica280422;

public class CtrlMatrizJoin {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int aux = 1;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matriz[i][j] = aux;
                aux++;
            }
        }

        for(int i=0 ; i<matriz.length ; i++){

            int[] lista = new int[matriz.length];

            Thread th1 = new Thread(new MatrizJoin(), "th1");
            th1.start();

            try {
                th1.join();

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }

    }
}
