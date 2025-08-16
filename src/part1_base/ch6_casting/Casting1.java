package part1_base.ch6_casting;

public class Casting1 {
    
    public static void main(String[] args) {
        
        // Part1 - 기본
        // 표현 범위 int < long < double
        // double 은 long 의 모든 값을 커버할 수 있지만, 큰 정수는 정확히 표현 못한다.
        
        int intValue = 10;
        int intValue2 = 20;
        long longValue;
        double doubleValue;
        
        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); // longValue = 10
        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue); // doubleValue1 = 10.0
        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); // doubleValue2 = 20.0
        
        
        long testL = intValue2 / intValue;
        
        // Note - 자동 형변환
        // 작은 범위 -> 큰범위 자동으로 형변환됨 (하지만 다음과 같은 순서로 자동 진행되는것)
        doubleValue = intValue;
        doubleValue = (double) intValue; // 형 맞추기
        doubleValue = (double) 10; // 변수 값 읽기
        doubleValue = 10.0; // 형변환
        
        
        // Note - 명시적(수동) 형변환
        // 큰범위 -> 작은범위 : 소숫점 버림 or 오버플로우 발생
        double doubleValue2 = 1.5;
        int intValue3 = 0;
        // intValue = doubleValue; //컴파일 오류 발생
        intValue3 = (int) doubleValue2; // 형변환
        System.out.println(intValue); // 출력:
        
        
        // Part2 - 계산시 형변환
        // 1. 같은 타입끼리 연산은 같은 타입 배출
        // 2. 서로 다른 타입 끼리의 연산은 범위가 더 큰 형태로 타입 배출
        
        
        // Part3 - 주의사항
        int div1 = 3 / 2; // div1 = 1;
        double div2 = 3 / 2; // div2 = 1.0;
        double div3 = 3.0 / 2.0; // div3 = 1.5;
        double div4 = (double) 3 / 2; // div4 = 1.5;
        // double div4 = (double) 3 / (double) 2;
        // double div4 = 3.0 / 2.0;
        // double div4 = 1.5;
        
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);
        System.out.println(div4);
        
        // Part4 - 주의사항2
        // 1. 함수 인자 -> 파라미터 와같은 할당이 일어나는 모든곳에는 자동,명시적 형변환 룰이 적용됨
        
    }
}
