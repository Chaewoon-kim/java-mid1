package enumeration.ex2;

import java.sql.SQLOutput;

public class ClassRefMain {
    public static void main(String[] args) {
        //클래스 정보 얻어오기
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());;
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());;
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());;

        //각각 다른 인스턴스 값
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
