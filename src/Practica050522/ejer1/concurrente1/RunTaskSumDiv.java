package Practica050522.ejer1.concurrente1;

import java.util.List;
import java.util.stream.IntStream;

public class RunTaskSumDiv {
   /*public static void main(String[] args) {
        var nums = List.of(6,28,45,89);
        for(var num : nums) {
            TaskSumDiv task = new TaskSumDiv(num);
            Thread thread = new Thread(task);
            thread.start();
        }
    }*/
    public static void main(String[] args) {
        //var nums = List.of(6,28,45,89);
        IntStream.range(100_000, 1_000_000)
                .forEach(num -> {
                    TaskSumDiv task = new TaskSumDiv(num);
                    Thread thread = new Thread(task);
                    thread.start();
                });
        }
    }

