package Practica050522.ejer2.Concurrent;

import java.util.ArrayList;
import java.util.List;

public class RunCountWord {
    public static void main(String[] args) throws InterruptedException {
        var documents = List.of(
                "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto",
                "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto",
                "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto",
                "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto",
                "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto",
                "Esto es un ejemplo de un texto El texto es sencillo El texto es simple El texto es corto");

        List<TaskCountWord> threads = new ArrayList<>();

        for(var document : documents) {
            TaskCountWord taskCountWord = new TaskCountWord(document);
            taskCountWord.start();
            threads.add(taskCountWord);
        }

        waitingThreads(threads);

        for(var t : threads) {
            System.out.println("=_=_=_=_=_=_=");
            for (var wc : t.getCounters()) {
                System.out.printf("\t%s(%d)%n", wc.word(), wc.counter());
            }
            System.out.println("=_=_=_=_=_=_=");
        }
    }
    private static void waitingThreads(List<TaskCountWord> threads) throws InterruptedException{
        for (var t :threads) {
            t.join();
        }
    }
}

