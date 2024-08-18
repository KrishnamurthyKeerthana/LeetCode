package org.example;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"ate", "tan", "eat", "ant", "bat"};
        System.out.println(groupAnagrams.solution(strs));
    }
    public List<List<String>> solution(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
