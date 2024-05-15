package com.org.exceptionhandlingexamples;

public class UserDefinedMain {

    public static void main(String[] args) {
        UserDefinedExceptionExample userDefinedExceptionExample = new UserDefinedExceptionExample();
        boolean b = false;
        try {
            b = userDefinedExceptionExample.eligbleForVote(55);
        } catch (AgeInvlidException ageInvlidException) {
            System.out.println(ageInvlidException.getMessage());
            System.out.println("Not eli");
        }
        System.out.println(b);
    }
}
