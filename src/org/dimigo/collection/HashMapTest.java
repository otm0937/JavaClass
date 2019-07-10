package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // key, value 로 구성
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 100);
        map.put("mat", 90);
        map.put("eng", 80);
        map.put("eng", 90);
        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        printMap(map);

        map.clear();
        printMap(map);

        // Map : key(String), value(list<String>)
        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("노래1");
        list.add("노래2");
        list.add("노래3");
        map2.put("댄스", list);

        // List : Map<String, String>
        List<Map<String, String>> list2 = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("댄스", "노래");
        map3.put("발라드", "노래2");
        list2.add(map3);
    }

    private static void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + " | ");
        }
        System.out.println();
    }
}
