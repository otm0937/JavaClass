package org.dimigo.oop;

public class BookTest2 {
    private static void compare() {
        int a = 10;
        int b = a;
        System.out.println(a == b ? "ture" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "ture" : "false");
        book.setTitle("수학의바이블");
        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());
    }

    public static void main(String[] args) {
        compare();
        System.out.println("------------------------------------");
        int num = 5;
        methodA(num);
        System.out.println(num);
        System.out.println("------------------------------------");

        Book book = new Book("Word Master");
        methodB(book);
        System.out.println(book.getTitle());
        System.out.println("------------------------------------");

        mothodC(book);
        System.out.println(book.getTitle());

        Book book2 = new Book("미생");
        System.out.println(book2.getTitle().length());


    }

    private static void mothodC(Book book) {
        book.setTitle("생존코딩");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("이것이 자바다.");
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }
}
