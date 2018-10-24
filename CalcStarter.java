package com.hillel.calc;

public class CalcStarter {
    public static void main (String[] args) {
         int a = MainCalc.add(2,1);
           System.out.println("2 add 1 = " + a);
         int b = MainCalc.sub(2,1);
           System.out.println("2 minus 1 = " + b);
         int c = MainCalc.mult(2,1);
           System.out.println("2 mult by 1 = " + c);
    }
}
