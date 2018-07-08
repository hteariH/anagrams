package com.mamoru.anagrams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * user: alekseyb
 * date: 05.07.18
 */
public class Main {
    public static void main(String[] args) throws Exception {

        new Main().run();

    }

    void run() throws Exception {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        List<Character> anagram = isAnagram(s2, s1);
        if (anagram.isEmpty()) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println(anagram);
        }
    }

    List<Character> isAnagram(String word, String anagram) throws Exception {
        if (word.length() != anagram.length()) {
            throw new Exception("Strings must be same length");
        }
        char[] a = anagram.toCharArray();
        List<Character> wordList = word.chars().mapToObj((int c) -> (char) c).collect(Collectors.toList());
        for (Character ch : a) {
            wordList.remove(ch);
        }
        return wordList;
    }
}
