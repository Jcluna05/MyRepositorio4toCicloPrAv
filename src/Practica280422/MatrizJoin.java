package Practica280422;

import java.io.OutputStreamWriter;

public class MatrizJoin extends Thread {
    private int count;

    @Override
    public void run() {

        int[][] matriz = new int[3][3];

        var suma = new MatrizSincronizacion();
        for(int i=0 ; i<matriz.length ; i++){

            int[] lista = new int[matriz.length];

            for(int j=0 ; j<matriz.length ; j++){
                lista[j] = matriz[i][j];
            }
            suma.increment(lista);
       }


        System.out.println("El resultado es: " + suma.getCount());
    }
}
