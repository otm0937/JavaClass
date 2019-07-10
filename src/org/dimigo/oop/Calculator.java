package org.dimigo.oop;

public class Calculator {
    //인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerFlag = false;

    // 생성자
    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 인스턴스 메소드
    public void powerOn() {
        if (!this.powerFlag) {
            this.powerFlag = true;
            System.out.println("전원을 켭니다.");
        }
    }

    public void powerOff() {
        if (this.powerFlag) {
            this.powerFlag = false;
            System.out.println("전원을 끕니다.");
        }
    }

    public int add() {
        this.powerOn();
        return this.num1 + this.num2;
    }

    public int sub() {
        this.powerOn();
        return this.num1 - this.num2;
    }

    public int mul() {
        this.powerOn();
        return this.num1 * this.num2;
    }

    public double div() {
        this.powerOn();
        return (double) this.num1 / this.num2;
    }

    // getter
    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
}
