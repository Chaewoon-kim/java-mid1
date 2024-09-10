package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    //문제3. 인증 등급 열거형 활용하기
    //인증 등급을 입력 받아서 열거형으로 변환
    //인증 등급에 따라 접근할 수 있는 화면이 다르다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN , ADMIN] : ");
        String grade = sc.nextLine();

        //대소문자 구분을 없애기 위함
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        //인증 등급 (level)에 따라 접근할 수 있는 화면이 다르다는 조건문.
        System.out.println("==메뉴 목록==");
        if(authGrade.getLevel() > 0){
            System.out.println("- 메인 화면");
        }if(authGrade.getLevel() > 1){
            System.out.println("- 이메일 관리 화면");
        }if(authGrade.getLevel() > 2){
            System.out.println("- 관리자 화면");
        }
    }
}
