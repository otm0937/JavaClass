package org.dimigo.interfaces;

public class Pig implements IAnimal {
    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void bark() {
        System.out.println("꿀꿀");
    }
}
