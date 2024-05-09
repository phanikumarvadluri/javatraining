package com.org.Strings;

public class Methods {

    public static void main(String[] args) {
        /*(
        Operation:
        Length-----length
        Create new string from exsting -   concat,replace,toLowercase,toUppercase,trim,split
        extract substring=== charAt, subString
        Test substring- contains,endsith,strtsWIth,indexOf,lastIndexof
        comparision = equals, equalsignorecase,isempty,compareTo,comparetoIgrnorecase
        Formating- format
         */

        String s = "Hel9o";
        char c = s.charAt(3);
        String substring = s.substring(1);
        System.out.println("s length  " + s.length() + "and char is " + c +"substring is "+substring);
        String sente = "sun,raise,in,the,east";
        String[] res = sente.split(",");
        for (String eachword : res) {
            System.out.println(eachword);
        }
    }

}
