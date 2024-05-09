package com.org.workingwithclasses.classes;

public class g {
    public static void main(String[] args) {
        double[] leftvals = {100.0d, 25.0d, 22.0d, 11.0d};
        double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opscode = {'d', 'a', 's', 'm'};
        double res[] = new double[4];

        for (int i = 0; i < opscode.length; i++) {
            execute(opscode, i, res, leftvals, rightvals);
        }
        System.out.println(res);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static void execute(char[] opscode, int i, double[] res, double[] leftvals, double[] rightvals) {
        switch (opscode[i]) {
            case 'a':
                res[i] = leftvals[i] + rightvals[i];
                break;
            case 's':
                res[i] = leftvals[i] - rightvals[i];
                break;
            case 'm':
                res[i] = leftvals[i] * rightvals[i];
                break;
            case 'd':
                if (rightvals[i] != 0) {
                    res[i] = leftvals[i] / rightvals[i];
                } else {
                    System.out.println("given number val2 is zero");
                }
                break;
            default:
                System.out.println("invalid input");
                res[i] = 0.0d;
        }
    }


}

