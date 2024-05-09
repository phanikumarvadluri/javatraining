package com.org.workingwithclasses.interfaces;

public class SwitchStatementArray {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(22.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result=" + equation.result);
        }
    }

    private static MathEquation create(double leftVal, double rigthVal, char d) {
        MathEquation mathEquation = new MathEquation();
        mathEquation.leftvalue = leftVal;
        mathEquation.rightValue = rigthVal;
        mathEquation.opCode = d;
        return mathEquation;
    }
}
