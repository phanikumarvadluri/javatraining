package com.org.inhertence;

import static com.org.workingwithclasses.staticmembers.MathEquation.getAverage;

public class Main {

    public static void main(String[] args) {
        //MathEquation[] equations = new MathEquation[4];
        Object[] equations=new Object[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(22.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

        for (Object equation : equations) {
            MathEquation math=(MathEquation)equation;
            math.execute();
            System.out.println("result=" + math.getResult());
        }



         //MathEquation.getAverage();
        double average = getAverage();
        System.out.println(average);

        MathEquation mathEquation=new MathEquation('d');
        double leftValue=9.0d;
        double rightValue=4.0d;
        mathEquation.execute(leftValue,rightValue);
        System.out.println(mathEquation.getResult());
    }
}
