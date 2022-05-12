package Practica;

import java.util.List;

public class MetodoSecuencial {

    public static void main(String[] args) {
        List<Integer> listnum = List.of(1,2,3,4,5,6,7,8,9,10,11);

        for (var n: listnum) {
            if(n%2 == 0) {
                System.out.println(String.format("El %d es par", n));
            }
        }
    }

}
