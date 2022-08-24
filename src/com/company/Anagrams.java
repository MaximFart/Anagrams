package com.company;

public class Anagrams {

    public final static String SPACE = " ";

    public String reverseLines(String line) {

        String[] words = line.split(SPACE);
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < wordArray.length; i++) {
                if (Character.isLetter(wordArray[i])) {
                    temp.append(wordArray[i]);
                }
            }
            result.append(temp.reverse());
        }
        return finalReverse(result, line.toCharArray());
    }
    public String finalReverse(StringBuilder result, char[] charsLine) {

        for (int i = 0; i < charsLine.length; i++) {
            if (!Character.isAlphabetic(charsLine[i])) {
                result.insert(i, charsLine[i]);
            }
        }
        return String.valueOf(result);
    }
}

