package com.shiyan.vote;

import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Map<String, List<String>> data = new HashMap<>();

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "A", "C");
        data.put("朱元璋", selects1);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "C", "D");
        data.put("朱棣", selects2);

        List<String> selects3 = new ArrayList<>();
        Collections.addAll(selects3, "B", "C", "D");
        data.put("朱高炽", selects3);

        System.out.println(data);

        Map<String, Integer> infos = new HashMap<>();
        Collection<List<String>> values = data.values();

        for (List<String> value : values) {
            for (String s : value) {
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                } else {
                    infos.put(s, 1);
                }
            }
        }

        System.out.println(infos);
    }
}
