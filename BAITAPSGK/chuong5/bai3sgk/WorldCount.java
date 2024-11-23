package baitap.chuong5.bai3;

import java.util.HashMap;
import java.util.Map;

public class WorldCount {
    public static void main(String[] args) {
        String[] sentences = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        int totalWords = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            totalWords += entry.getValue();
        }

        System.out.println("Total words: " + totalWords);
    }
}

