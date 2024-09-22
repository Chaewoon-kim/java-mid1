package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,21); //LocalDate.of() -> 지정 날짜
        System.out.println("오늘 날짜: " + nowDate);
        System.out.println("지정 날짜: " + ofDate);

        ofDate = ofDate.plusDays(10); //날짜 더하기
        System.out.println("지정 날짜 + 10d = " + ofDate);


    }
}
