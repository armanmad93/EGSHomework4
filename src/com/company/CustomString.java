package com.company;

import java.util.ArrayList;

/**
 * @author Arman Karapetyan
 */

public final class CustomString {

    private final char[] charContainer;

    public CustomString(char[] chars) {
        if (chars.length == 0) {
            charContainer = null;
        } else {
            charContainer = new char[chars.length];
            System.arraycopy(chars, 0, charContainer, 0, chars.length);
        }
    }

    public int length() {
        return charContainer.length;
    }

    public char[] subString(int start, int end) {

        char[] subChar = new char[end - start];
        int iteration = 0;

        /*
          if first index < 0 or
          last index < 0 or
          last index is smaller or equals first index or
          last index more then ArrayList size
          then return -1 (wrong entry)
         */
        if (start < 0 || end < 0 || end <= start || end > charContainer.length) {
            return new char[]{'0'};
        }

        for (int i = start; i < end; i++) {
            subChar[iteration] = charContainer[i];
            iteration++;

        }

        return subChar;
    }

    public int compareTo(String input) {

        int minimumLength = Math.min(charContainer.length, input.length());

        for (int i = 0; i < minimumLength; i++) {
            if (charContainer[i] != input.charAt(i)) {
                return charContainer[i] - input.charAt(i);
            }
        }
        return charContainer.length - input.length();
    }

    public char[] replace(char oldChar, char newChar) {

//        StringBuilder word = new StringBuilder();
        char[] newWord = new char[charContainer.length];
        boolean term = true;

        //if oldChar dont have in our sentence then return 0
        for (Character value : charContainer) {
            if (value == oldChar) {
                term = false;
                break;
            }
        }
        if (term) {
            return new char[]{'0'};
        }

        //if old char and new char is equals then return this
        if (oldChar == newChar) {
            return charContainer;
        }

        for (int i = 0; i < charContainer.length; i++) {
            if (charContainer[i] == oldChar) {
                charContainer[i] = newChar;
            }
            newWord[i] = charContainer[i];
        }

        return newWord;
    }

    public boolean contains(String input) {

        if (input == null) {
            return false;
        }

        int index = 0;
        char[] subStringArray = input.toCharArray();

        //if subString have more length then our string return false
        if (charContainer.length < input.length()) {
            return false;
        }

        //if subClass dont have any symbols


        for (int i = 0; i < charContainer.length; i++) {

            if (charContainer[i] == subStringArray[index]) {
                index++;
                if (index == subStringArray.length) {
                    return true;
                }
            } else {
                i = i - index;
                index = 0;
            }
        }
        return false;
    }

    public int indexOf(char symbol) {
        for (int i = 0; i < charContainer.length; i++) {
            if (charContainer[i] == symbol) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return charContainer.length == 0;
    }

    public Character CharAt(int index) {

        for (int i = 0; i < charContainer.length; i++) {
            if (i == index) {
                return charContainer[i];
            }
        }
        return null;
    }

    public StringBuilder valueOf(long value) {

        long[] ints = new long[getLengthFromPrimitiveNumber(value)];
        StringBuilder stringBuilder = new StringBuilder();

        //all element add to ints array and start to last index
        for (int i = ints.length - 1; i >= 0; i--) {
            ints[i] = value % 10;
            value /= 10;
        }

        //all elements array add to StringBuilder
        for (long anInt : ints) {
            stringBuilder.append(anInt);
        }

        return stringBuilder;
    }

    public boolean equalsIgnoreCase(String anotherString) {

        if (anotherString == null || charContainer.length != anotherString.length()) {
            return false;
        }

        char[] anotherStringElement = anotherString.toCharArray();


        for (int i = 0; i < charContainer.length; i++) {
            if (charContainer[i] != anotherStringElement[i]) {
                if ((charContainer[i] + 32) != anotherStringElement[i]) {
                    if (charContainer[i] != (anotherStringElement[i] + 32)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // get length for primitive number
    private int getLengthFromPrimitiveNumber(long value) {

        int length = 0;

        while (value != 0) {
            length++;
            value /= 10;
        }

        return length;
    }

    public char[] getCharContainer() {
        return charContainer;
    }
}
