package org.dimigo.inheritance;

public class Student extends Person {
    private String studentID;

    public Student(String name, int age, int height, int weight, String studentID) {
        super(name, age, height, weight);
        this.studentID = studentID;
    }

    public void exam() {
        System.out.println(getName() + " 이 시험을 봅니다.");
    }

    public void study() {
        System.out.println(getName() + " 이 공부를 합니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' + super.toString() + '}';
    }

}
