package com.company;

public class Main {

    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        String str = anagrams.reverseLines("abc1d moly");
        System.out.println(str);
    }
}
