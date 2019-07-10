package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        //1. 산술연산자
        int a = 5, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //2.5가 나오게 하려면?;
        System.out.println((double) a / b);
        System.out.println(a * 1.0 / b);

//        System.out.println(a / 0);

        //2. 다른 타입간의 연산
        int i = 10;
        double d = 3.14;
        int r = (int) (i + d);
        int r2 = i + (int) d;
        double r3 = i + d;

        //int보다 작은 타입간의 연산
        short s1 = 1, s2 = 2;
        short r4 = (short) (s1 + s2);
        int r5 = (short) (s1 + s2);

        //3. Short-CIrcuit 테스트
        boolean flag = true;
        a = 10;
        b = 0;
        if (flag || (a / b == 0)) {
            System.out.println("OR 연산");
        }
        if (!flag && (a / b == 0)) {
            System.out.println("AND 연산");
        }

        int x = 0, result;
//        (x>=0) ?result = x : result = -x;
        result = (x >= 0) ? x : -x;

        //4. 문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 4;
        String name = "김가은";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school + name);

        //24디미고김가은 출력하려면?

        System.out.println("" + grade + ban + school + name);
        System.out.println(grade + (ban + school) + name);

    }
}
