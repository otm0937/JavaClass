package org.dimigo.oop2;

public class Singleton {

    //하나 만들기(null)
    private static Singleton instance;

    // 하나 던져주기
    public static Singleton getInstance() {
        return instance;
    }

    public static synchronized Singleton getInstance2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // new 로 객체생성 못함
    private Singleton() {
    }

}
