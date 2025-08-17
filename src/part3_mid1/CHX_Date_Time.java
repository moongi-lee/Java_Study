package part3_mid1;

import java.time.*;
import java.util.Date;

public class CHX_Date_Time {
    
    public static void main(String[] args) {
        
        Date date = new Date(); // Sun Aug 17 09:53:19 KST 2025
        
        // Note - Local이 붙는 이유는 세계 시간대를 고려하지 않아 타임존 적용되지 않기 때문
        // LocalXXX 은 불변이기 떄문에 변경시 꼭 다시 할당받아야함.
        // 특정 지역 날짜 시간 고려할때 사용
        LocalDate localDate = LocalDate.now(); // YYYY-MM-DD
        LocalTime localTime = LocalTime.now(); // hh:mm:ss.sssnnn
        LocalDateTime localDateTime = LocalDateTime.now(); // YYYY-MM-DDThh:mm:ss.sssnnn
        
        // Note - 시간대를 고려한 날짜 시간 표현하며 타임존이 포함됨, 일광 절약 시간제 적용됨
        // LocalDateTIme 에 ZoneOffset, ZoneId 가 추가된것
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // YYYY-MM-DDThh:mm:ss.sssnnnxxx+hh:mm[Asia/Seoul]
        
        // Note - 타임존은 없고 UTC로 부터의 시간대 차이인 고정된 오프셋만 포함, 일광 절약 시간제 적용안됨
        // LocalDateTime에 ZoneOffset 추가된것
        OffsetDateTime offsetDateTime = OffsetDateTime.now(); // YYYY-MM-DDThh:mm:ss.sssnnnxxx+hh:mm
        OffsetTime offsetTime = OffsetTime.now(); // hh:mm:ss.sssnnnxxx+hh:mm
        
        // Note - 년, 월 표현할때씀, 잘 사용하지 않음.
        Year year = Year.now(); // yyyy
        Month month = Month.JULY; // JULY
        YearMonth yearMonth = YearMonth.now(); // yyyy-MM
        MonthDay monthDay = MonthDay.now(); // --MM-DD
        
        // Note - Instant
        // Instant는 UTC(협정 세계시)를 기준으로 하는, 시간의 한 지점을 나타낸다.
        // Instant는 날짜와 시간을 나노초 정밀도로 표현하며, 1970년 1월 1일 0시 0분 0초(UTC)를 기준으로 경과한 시간으로 계산된다.
        // 쉽게 이야기해서 Instant 내부에는 초 데이터만 들어있다. (나노초 포함)
        Instant instant = Instant.now(); // yyyy-mm-ddTHH:MM:SS.sssnnnxxxZ
        
        // Note - 시간, 날짜의 간격
        // Period : 두 날짜의 간격을 년월일 로 나타냄
        // Duration : 두 날짜의 간격을 시분초 로 나타냄
        Period period = Period.ofDays(10); // P10D
        Duration duration = Duration.ofDays(10); // PT240H
    }
    
    
    public static void localDate() {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        
        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        
        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        
        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
        System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);
        
        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은 구성요소인가?(내부 데이터 구성요소 모두 같아야함.) " + nowDt.equals(ofDt));
    }
    
    public static void zoneDateTime() {
        
        //  now() 현재 날짜와 시간을 기준으로 생성한다. 이때  ZoneId는 현재 시스템을 따른다.
        //  ZoneId.systemDefault()
        ZonedDateTime nowZdt = ZonedDateTime.now();
        
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        
        //  withZoneSameInstant(ZoneId) 타임존을 변경한다. 타임존에 맞추어 시간도 함께 변경된다.
        //  이 메서드를 사용하면 지금 다른 나라는 몇 시 인지 확인일 수 있다.
        //  예를 들어서 서울이 지금 9시라면, UTC 타임존으로 변경하면 0시를 확인할 수 있다
        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        
        System.out.println("nowZdt = " + nowZdt);
        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);
        System.out.println("utcZdt = " + utcZdt);
        
        
    }
    
    public static void instant() {
        // Note - instant는 Epoch 시간이다. (1970년 1월 1일 00:00:00 UTC부터 현재까지 경과된 시간을 초 단위로 표현한 것)
        
        // 장점
        // 시간대 독립성 - Instant 는 UTC를 기준으로 하므로, 시간대에 영향을 받지 않는다. 이는 전 세계 어디서나 동일한 시점을 가리키는데 유용하다.
        // 고정된 기준점 - 모든 Instant는 1970년 1월 1일 UTC를 기준으로 하기 때문에, 시간 계산 및 비교가 명확하고 일관된다.
        
        // 사용 예
        // 전 세계적인 시간 기준 필요 시
        // Instant는 UTC를 기준으로 하므로, 전 세계적으로 일관된 시점을 표현할 때
        // 사용하기 좋다. 예를 들어, 로그 기록이나, 트랜잭션 타임스탬프, 서버 간의 시간 동기화 등이 이에 해당한다.
        
        // 시간대 변환 없이 시간 계산 필요 시
        // 시간대의 변화 없이 순수하게 시간의 흐름(예: 지속 시간 계산)만을 다루고
        // 싶을 때Instant가 적합하다. 이는 시간대 변환의 복잡성 없이 시간 계산을 할 수 있게 해준다.
        
        // 데이터 저장 및 교환
        // 데이터베이스에 날짜와 시간 정보를 저장하거나, 다른 시스템과 날짜와 시간 정보를 교환할때
        // Instant를 사용하면, 모든 시스템에서 동일한 기준점(UTC)을 사용하게 되므로 데이터의 일관성을 유지하기 쉽다.
        
        Instant now = Instant.now(); // UTC 기준
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        Instant epochStart = Instant.ofEpochSecond(0);
        
        // 계산
        Instant later = epochStart.plusSeconds(3600);
        
        // 조회
        long laterEpochSecond = later.getEpochSecond();
        
        System.out.println("now = " + now);
        System.out.println("from = " + from);
        System.out.println("epochStart = " + epochStart);
        System.out.println("later = " + later);
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
    
    public static void period() {
        Period period = Period.ofDays(10);
        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        
        // 기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        
        System.out.println("period = " + period);
        System.out.println("현재 날짜: " + currentDate);
        System.out.println("더한 날짜: " + plusDate);
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
    
    public static void duration() {
        Duration duration = Duration.ofMinutes(30);
        LocalTime lt = LocalTime.of(1, 0);
        
        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);
        
        // 시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        
        System.out.println("duration = " + duration);
        System.out.println("기준 시간 = " + lt);
        System.out.println("더한 시간 = " + plusTime);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무 시간: " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
    }
    
}
