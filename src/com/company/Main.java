package com.company;

/**
 * @author Arman Karapetyan
 */

public class Main {

    public static void main(String[] args) {

	    CustomString customString = new CustomString("Arman");

	    //test length
        System.out.println(customString.length());

        //test subString method
        System.out.println(customString.subString(0, 3));

        //test compareTo method
        System.out.println(customString.compareTo("Arman"));
        System.out.println(customString.compareTo("ArmanMad"));
        System.out.println(customString.compareTo("Arm"));
        System.out.println(customString.compareTo("someName"));

        //test replace method
        System.out.println(customString.replace('m', 'M'));

        //test contains method
        System.out.println(customString.contains("ArM"));
        System.out.println(customString.contains("arm"));
    }
}
