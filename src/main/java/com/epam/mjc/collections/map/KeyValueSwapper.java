package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            if(res.containsKey(e.getValue())){
                Integer i = res.get(e.getValue());

                if(i>e.getKey()){
                    res.put(e.getValue(), e.getKey());
                }else{
                    res.put(e.getValue(), i);
                }
            }else {
                res.put(e.getValue(), e.getKey());
            }
        }

        return res;
    }
}
