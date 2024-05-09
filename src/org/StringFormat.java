package com.org;

public class StringFormat {
    public static void main(String[] args) {

        int david = 17;
        int cler = 15;
        int wills = 8;
        int virat = 34;
/*

string concatination
 */
        String s1 = "My nephew are " + david + ", " + cler + " ," + wills + ", and " + virat + " years old";

        //String formatting

        String s2= String.format("My nephew are %d,%d,%d, and %d years old",david,cler,wills,virat);

        System.out.println(s1);
        System.out.println(s2);
    }

}
