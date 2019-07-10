package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator c = new Calculator(a, b);
        c.powerOn();
        System.out.println(c.getNum1() + " + " + c.getNum2() + " = " + c.add());
        System.out.println(c.getNum1() + " - " + c.getNum2() + " = " + c.sub());
        System.out.println(c.getNum1() + " * " + c.getNum2() + " = " + c.mul());
        System.out.println(c.getNum1() + " / " + c.getNum2() + " = " + c.div());
        c.powerOff();
    }
}
