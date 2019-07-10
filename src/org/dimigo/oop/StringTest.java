package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        // 문자열 리터럴방식 (literal pool)
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        // new 객체생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        // 문제
        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "야옹이");

        String id = "admin";

        // id가 "admin" 이면 "관리자" 출력
        // "admin" 이 아니면 "관리자 아님" 을 출력

        System.out.println("admin".equals(id) ? "관리자" : "관리자 아님");

        testString();
    }

    private static void testString() {

            int[] a = new int[]{0,1,2,3,4};
            a.length

//          01234567890123
          String s = "abcdefgABCDEFG";
//        String s = "txtArea_sentence1";
//        String s = "txtArea_word111";
//        String s = "6,500원";
        System.out.println(s.length());         // 14
        System.out.println(s.substring(1));     // defgABCDEFG
        System.out.println(s.substring(3, 6));  // def
        System.out.println(s.indexOf("C"));     // C -> 9
        System.out.println(s.charAt(4));        // 9 -> C
        System.out.println(s.concat("ABC"));    // abcdefgABCDEFGABC
        System.out.println("  ABC  ".trim());   // ABC
        System.out.println(s.toUpperCase());    // ABCDEFGABCDEFG
        System.out.println(s.toLowerCase());    // abcdefgabcdefg
        System.out.println(s.replace(',','A')); //AbcdefgABCDEFG
        System.out.println(s.replaceAll(",","").replaceAll("원","")); //AbcdefgABCDEFG
        System.out.println(s.startsWith("abc")); //시작이 abc이면 true
        System.out.println(s.endsWith("EFG"));  //끝이 DFG이면 true

        // length, substring, trim 많이씀
    }
}
