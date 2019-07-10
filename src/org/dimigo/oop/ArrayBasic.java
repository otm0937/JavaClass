package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 타입 배열
        // int, float, double, char, boolean, byte, long, short
        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);

        int[] intArr2 = {1, 2, 3, 4, 5};
        //int[] intArr2 = new int{1, 2, 3, 4, 5};
        printArray(intArr2);

        // double 타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = new double[5];
        printArray(doubleArr);

        // 참조형 배열 타입
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "문진호";
        printArray(strArr);

        String[] strArr2 = {"ITZY", "소녀시대", "걸스데이"};
        printArray(strArr2);

        // Book 타입 배열 2개짜리 생성
        // Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 200);
        printArray(bookArr);
        Book[] bookArr2 = {new Book("수학의 바이블", "김재영", 100), new Book("워드마스터", "전유원", 200)};
        printArray(bookArr2);

        // 배열 사용 시 주의사항!!
        int[] intarr3 = new int[3];
        System.out.println(intarr3.length);
        System.out.println(intarr3[intarr3.length-1]);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
//        System.out.println(strArr3[0].length());

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);  //null
        System.out.println(bookArr3[0].getTitle());
    }

    private static void printArray(Book[] bookArr) {
        for (Book value : bookArr) {
            System.out.println(value);
        }
    }

    private static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for (double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }


    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }
}
