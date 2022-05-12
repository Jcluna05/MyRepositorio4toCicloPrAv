package Practica;

import java.util.List;

public class CtrlEvenNumber {
    public static void main(String[] args) {

        List<Integer> listnum = List.of(1,2,3,4,5,6,7,8,9,10,11);

        for (var a : listnum) {
            new Thread(new MetodoParalelo(a)).start();
        }
    }
}
