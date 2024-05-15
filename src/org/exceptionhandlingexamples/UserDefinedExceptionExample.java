package com.org.exceptionhandlingexamples;

public class UserDefinedExceptionExample {


    public boolean eligbleForVote(int age) throws AgeInvlidException {

        if (age > 18) {
            System.out.println("Eligible for vote");
            return true;
        } else {
            throw new AgeInvlidException("Not Eligible sldgjdflgjsdfkgjfsdlkgjklfsdjgkfjgkldsjdfkljsdfg");
        }
    }

}
