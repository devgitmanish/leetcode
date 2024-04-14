package com.leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static Map<Character, Integer> countCharacter(String str) {

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static String countCharacterWithRemoveDuplicate(String str) {

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        map.entrySet()
                .stream()
                .forEach(x -> System.out.println("Character :"+x.getKey()
                        +" Count "+x.getValue()));

        /*Remove Duplicate*/
        StringBuilder builder = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(map.get(ch)==1)
                builder.append(ch);
        }
        return builder.toString();
    }

    public static HashSet<Character> nonRepeatedChar(String str){

        HashSet<Character> hashSet = new LinkedHashSet<>();
        char [] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++){
            hashSet.add(ch[i]);
        }
        return hashSet;

    }

    public static String firstNonRepeatedChar(String str){

        char [] ch = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<ch.length; i++){

            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }
            else{
                map.put(ch[i], 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : ch){
            if(map.get(c)==1){
                stringBuilder.append(c);
                break;
            }
        }
        return stringBuilder.toString();
    }


    public static String getFirstNonReptead(String str){

        Character result =  str.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get();
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        //String str = "MiSsIsSiPpI";
        String str = "aappKe";
        //System.out.println("====================================");
        //System.out.println(countCharacterWithRemoveDuplicate(str));

        //nonRepeatedChar(str).stream().forEach(x -> System.out.print(x));

        //System.out.println("First non repeated character "+firstNonRepeatedChar(str));
        System.out.println("First non repeated character via java 8 "+getFirstNonReptead(str));
    }
}
