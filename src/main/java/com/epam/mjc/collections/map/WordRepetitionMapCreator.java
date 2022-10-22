package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();
        if(sentence.length()>0) {
            String word = sentence.toLowerCase().replace(",", "").replace(".", "").trim();

            String[] split = word.split(" ");
            int c = 1;
            for (String w : split)
                if (res.containsKey(w)) {
                    c = res.get(w);
                    c++;
                    res.put(w, c);
                    c = 1;
                } else {
                    res.put(w, c);
                }
        }
        return res;

    }
}
