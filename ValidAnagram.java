package org.example;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        else
            for(char c:s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for(int count: map.values()){
            if(count != 0)
                return false;
        }

        return true;

    }
    public static void main(String[] args){
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram", t = "aagaram";
        System.out.println(validAnagram.isAnagram(s, t));

    }
}
