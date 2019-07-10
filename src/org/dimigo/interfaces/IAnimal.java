package org.dimigo.interfaces;

// 인터페이스 : 하나의 표준/규약/명세
public interface IAnimal {
    // 필드
    //상수처리 (public static final 자동 붙임)
    public static final String FARM_NAME = "디미 동물농장";

    // 추상메소드 선언
    //public abstract void eat();
    void bark();    //public abstract 자동 붙임

    // JDK 8부터 추가 (디폴트 메소드 추가)
    default public void eat() {
        System.out.println("냠냠");
    }

    // 정적 메소드
    static void welcome() {
        System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
    }
}
