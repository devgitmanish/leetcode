package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class MyntraNthHightestSalary {


    public static void getNthHighestSalary(Map<String, Integer> map,
                                           int num) {

        Map.Entry<String, Integer> stringIntegerEntry = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(num - 1);
        System.out.println(stringIntegerEntry);


    }

    public static void getNthDynamicHighestSalary(Map<String, Integer> map,
                                                  int num) {
        Map.Entry<Integer, List<String>> integerListEntry =
                map.entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Map.Entry::getValue,
                                Collectors.mapping(Map.Entry::getKey, Collectors.toList())))

                        .entrySet()
                        .stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                        .toList()
                        .get(num - 1);
        System.out.println(integerListEntry);

    }

    public static void getNthDynamicHighestSalaryu(Map<String, Integer> map,
                                                   int num) {

        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))

                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(num - 1);
        System.out.println(integerListEntry);


    }

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("manish", 1000);
        map.put("harish", 2000);
        map.put("alok", 3000);
        map.put("shyam", 4000);
        map.put("laxman", 5000);
        getNthHighestSalary(map, 2);


        map.put("manish", 1000);
        map.put("harish", 2000);
        map.put("golu", 2000);
        map.put("alok", 3000);
        map.put("bhavana", 4000);
        map.put("shyam", 4000);
        map.put("Neha", 5000);
        map.put("laxman", 5000);
        //getNthDynamicHighestSalaryu(map, 2);

    }
}
