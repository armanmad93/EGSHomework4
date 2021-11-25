package com.company;

import java.util.ArrayList;

/**
 * @author Arman Karapetyan
 */

public final class CustomString {

    private final ArrayList<Character> charContainer = new ArrayList<>();

    public CustomString(String string) {
        for (int i = 0; i < string.length(); i++) {
            this.charContainer.add(string.charAt(i));
        }
    }

    public int length() {
        return charContainer.size();
    }

    public String subString(int start, int end) {

        StringBuilder subString = new StringBuilder();

        /*
          if first index < 0 or
          last index < 0 or
          last index is smaller or equals first index or
          last index more then ArrayList size
          then return -1 (wrong entry)
         */
        if (start < 0 || end < 0 || end <= start || end > charContainer.size()) {
            return "-1";
        }

        for (int i = start; i < end; i++) {
            subString.append(charContainer.get(i));
        }

        return subString.toString();
    }

    public int compareTo(String input) {

        int minimumLength = Math.min(charContainer.size(), input.length());

        for (int i = 0; i < minimumLength; i++) {
            if (charContainer.get(i) != input.charAt(i)) {
                return charContainer.get(i) - input.charAt(i);
            }
        }
        return charContainer.size() - input.length();
    }

    public String replace(char oldChar, char newChar) {

        StringBuilder word = new StringBuilder();
        boolean term = true;

        //if oldChar dont have in our sentence then return -1
        for (int i = 0; i < charContainer.size(); i++) {
            if (charContainer.get(i) == oldChar) {
                term = false;
            }
        }
        if (term) {
            return "-1";
        }

        //if old char and new char is equals then return this
        if (oldChar == newChar) {
            for (int i = 0; i < charContainer.size(); i++) {
                word.append(charContainer.get(i));
            }
            return word.toString();
        }

        for (int i = 0; i < charContainer.size(); i++) {
            if (charContainer.get(i) == oldChar) {
                charContainer.set(i, newChar);
            }
            word.append(charContainer.get(i));
        }

        return word.toString();
    }

    public boolean contains(String input) {

        int index = 0;
        char[] subStringArray = input.toCharArray();

        //if subString have more length then our string return false
        if (charContainer.size() < input.length()) {
            return false;
        }

        for (int i = 0; i < charContainer.size(); i++) {

            if (charContainer.get(i) == subStringArray[index]) {
                index++;
                if (index == subStringArray.length) {
                    return true;
                }
            } else {
                index = 0;
            }
        }
        return false;
    }

    public ArrayList<Character> getCharContainer() {
        return charContainer;
    }
}
