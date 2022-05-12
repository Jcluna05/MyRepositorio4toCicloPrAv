package Practica050522.ejer2;

import java.util.Arrays;

public class SecuencialPalabras {
    public static void main(String[] args) {
        var text = "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto";

        String[] words = text.
                toLowerCase().
                split("\\s");

        var uniqueWords =
                Arrays.stream(words).
                        distinct().
                        toList();

        System.out.println(uniqueWords);

        for (var word2Count : uniqueWords) {
            counterWord(words, word2Count);
        }
    }

    public static void counterWord(String[] words, String wordToCount){
        int count = 0;
        for(var word : words) {
            if(word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }
        System.out.printf("%s - %d%n", wordToCount, count);
    }
}
