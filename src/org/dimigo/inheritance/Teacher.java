package org.dimigo.inheritance;

public class Teacher extends Person {
    private String subeject;

    public Teacher(String name, int age, int height, int weight, String subeject) {
        super(name, age, height, weight);
        this.subeject = subeject;
    }

    public void teach() {
        System.out.println(getName() + "선생님이 공부를 가르칩니다.");
    }

    public void doTask() {
        System.out.println(getName() + "선생님이 일을 합니다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subeject='" + subeject + '\'' + super.toString() +
                '}';
    }
}
