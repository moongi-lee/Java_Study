package common;

public class Note {
    
    public static void main(String[] args) {
        
        // Note - 리터럴
        // 코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java" 같은 고정된 값이 리터럴(literal)이다.
        int a = 100; // 정수 리터럴
        double b = 10.5; // 실수 리터럴
        boolean c = true; // 불리언 리터럴
        char d = 'A'; // 문자 리터럴
        String e = "Hello Java"; // 문자열 리터럴
        
        // Note - 당연한거
        // int 끼리의 나눗셈에서 생긴 결과는 자동으로 소숫점 이하 버림
        // String, Integer, Boolean, Double 등 레퍼객체와, String은 불변객체임
        
        // Note - 불변 vs 가변 (참조형)
        // 함수 인수로 참조형 불변, 가변 넘겨서 값 바꾸려고 할떄
        // 불변 - 아무리 같은 객체 참조하고 있다고 하더라도 값 변경하려고 하면 불변이기 떄문에 
        //       새로운 메모리에 새로운 변수 만들어서 값 할당됨
        // 가변 - 내부에서 값 변경이 외부에서 전달한 객체의 값도 변경됨
        
        // Note - 변수명, 메소드명
        // 변수명 - 보통 명사로
        // 메소드명 - 보통 동사로 시작
    }
    
}
