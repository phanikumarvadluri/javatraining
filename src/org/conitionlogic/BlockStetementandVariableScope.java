package com.org.conitionlogic;

public class BlockStetementandVariableScope {

    public static void main(String[] args) {
        double student=30.0d;
        double rooms=4.0d;
        double avg=0.0d;

        if(rooms>0.0d) {
            avg = student / rooms;
        }
        System.out.println(avg);
    }
}
