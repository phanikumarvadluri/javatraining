package com.org.Strings;

public class StringBuilder2 {

    /*

    provides mutable string buffer
   Efficiently constructs string value
   add new content to end with append
   add new content within with insert

     */

    public static void main(String[] args) {
        String location = "Florida";
        int flightNumber = 175;
        String time="9:00";

        StringBuilder sb = new StringBuilder(40);

        sb.append("i flew to ");
        sb.append(location);
        sb.append(" on Flight #");

        sb.append(flightNumber);

        int pos = sb.indexOf(" on");
        System.out.println(pos);

        sb.insert(pos," at ");

        sb.insert(pos+4, time);

        String string = sb.toString();

        System.out.println(string);

//        String location = "Florida";
//        int flightNumber = 175;
//
//        String res= "i flew to "+ location +" on FLighe #"+flightNumber;
//        System.out.println(res);


    }


}
