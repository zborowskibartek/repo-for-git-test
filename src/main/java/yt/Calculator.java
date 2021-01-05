package yt;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double divide(double num1, double num2) {
        if(num2 == 0){
            throw new ArithmeticException("Can not divide by 0");
        }
        return num1/num2;
    }
}
