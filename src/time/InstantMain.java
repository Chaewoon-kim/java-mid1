package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();
        System.out.println("now = " + now); //UTC 기준이기 때문에 현재 시간에서 -9시간이 결과로 나옴

        //ZonedDateTime을 Instant로 변환
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);
        
        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later); //3600초 -> 1시간
        
        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
