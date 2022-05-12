package Practica050522.ejer2.Concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskCountWord extends Thread {
    private String document;
    private List<WordCounter> counters = new ArrayList<>();

    public TaskCountWord(String document) {
        this.document = document;
    }

    @Override
    public void run() {
        String[] words = document.
                toLowerCase().
                split("\\s");

        var uniqueWords =
                Arrays.stream(words).
                        distinct().
                        toList();

        for (var word2Count : uniqueWords) {
            counterWord(words, word2Count);
        }
    }

    public void counterWord(String[] words, String wordToCount) {
        int count = 0;
        for (var word : words) {
            if (word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }
        counters.add(new WordCounter(wordToCount, count));
    }

    public List<WordCounter> getCounters() {
        return counters;
    }
}
