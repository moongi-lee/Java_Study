package common;

import part2_basic.CH4_Constroctor_C;

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
        
        // Note - 캡슐화
        // 클래스 안에 속성과 기능이 하나로 묶여 필요한 기능을 메서드를 통해 외부에 제공하는것.
        // 캡슐화를 통해 속성의 직접 변경을 방지하고 메소드로서만 변경 가능하게 하여 외부로 제공
        // 메서드 또한 숨겨야하는것은 숨기고 필요한 메서드만 외부로 노출
        // 올바른 캡슐화는 모든 데이터는 숨기고, 기능은 필요한 기능만 노출하는것이 좋은 캡슐화
    }
    
}
