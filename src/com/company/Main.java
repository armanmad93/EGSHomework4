package com.company;

/**
 * @author Arman Karapetyan
 */

public class Main {

    public static void main(String[] args) {

        CustomString customString = new CustomString("aaabaabcaabd");
        CustomString customString1 = new CustomString("Arman");

        //chack contains
        System.out.println(customString.contains("aaaa"));
        System.out.println(customString.contains("abd"));
        System.out.println(customString.contains("d"));
        System.out.println(customString.contains("abc"));
        System.out.println(customString.contains("b"));
        System.out.println(customString.contains("az"));
        System.out.println(customString.contains("aaa"));
        System.out.println(customString.contains("bd"));
        System.out.println(customString.contains("aba"));
        System.out.println(customString1.contains("Arm"));
        System.out.println(customString1.contains("arm"));

        //test length
        System.out.println(customString1.length());

        //test subString method
        System.out.println(customString1.subString(0, 3));

        //test compareTo method
        System.out.println(customString1.compareTo("Arman"));
        System.out.println(customString1.compareTo("ArmanMad"));
        System.out.println(customString1.compareTo("Arm"));
        System.out.println(customString1.compareTo("someName"));

        //test replace method
        System.out.println(customString1.replace('m', 'M'));

        //test contains method


        //chack isEmpty method
        System.out.println(customString1.isEmpty());

        //chack indexOf method
        System.out.println(customString1.indexOf('a'));

        //chack valueOf method
        System.out.println(customString1.valueOf(151554));

        //chack charAt method
        System.out.println(customString1.CharAt(3));
        System.out.println(customString1.CharAt(100));
        
    }
}
