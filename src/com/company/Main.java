package com.company;

/**
 * @author Arman Karapetyan
 */

public class Main {

    public static void main(String[] args) {

        CustomString customString = new CustomString(new char[]{'a', 'a', 'a', 'b', 'a', 'a', 'b', 'c', 'a', 'a', 'b', 'd'});
        CustomString customString1 = new CustomString(new char[]{'A', 'r', 'm', 'a', 'n'});

        //chack equalsIgnoreCase
        System.out.println(customString1.equalsIgnoreCase("Arman"));
        System.out.println(customString1.equalsIgnoreCase("ArmanA"));
        System.out.println(customString1.equalsIgnoreCase("arman"));
        System.out.println(customString1.equalsIgnoreCase("ArmaN"));
        System.out.println(customString1.equalsIgnoreCase("ArMAn"));
        System.out.println();

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
        System.out.println();

        //test length
        System.out.println(customString1.length());
        System.out.println();

        //test subString method
        System.out.println(customString1.subString(0, 3));
        System.out.println();

        //test compareTo method
        System.out.println(customString1.compareTo("Arman"));
        System.out.println(customString1.compareTo("ArmanMad"));
        System.out.println(customString1.compareTo("Arm"));
        System.out.println(customString1.compareTo("someName"));
        System.out.println();

        //test replace method
        System.out.println(customString1.replace('m', 'M'));
        System.out.println();

        //chack isEmpty method
        System.out.println(customString1.isEmpty());
        System.out.println();

        //chack indexOf method
        System.out.println(customString1.indexOf('a'));
        System.out.println();

        //chack valueOf method
        System.out.println(customString1.valueOf(151554));
        System.out.println();

        //chack charAt method
        System.out.println(customString1.CharAt(3));
        System.out.println(customString1.CharAt(100));

    }
}
