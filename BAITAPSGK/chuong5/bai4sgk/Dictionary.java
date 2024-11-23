package baitap.chuong5.bai4;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    // Phuong thuc khoi tao
    public Dictionary() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "qua tao");
        dictionary.put("ball", "qua bong");
        dictionary.put("cat", "con meo");
        dictionary.put("dog", "con cho");
    }

    // Phuong thuc lookup de tim nghia cua tu
    public String lookup(String word) {
        return dictionary.getOrDefault(word.toLowerCase(), "khong tim thay");
    }
}

