package org.dimigo.oop2;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance2();
        System.out.println(a);
        System.out.println(Singleton.getInstance2());
    }
}
