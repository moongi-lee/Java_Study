package part2_basic.CH9_Polymorphism.part4;

public class Main {
    
    public static void main(String[] args) {
        
        // Note - OOP 핵심
        // 추상화
        // 캡슐화
        // 상속
        // 다형성
        
        // 프로그램 유연하고 변경이 용이하게
        // 레고 블럭 조립하듯이
        // 키보드, 마우스 교체하듯이
        // 컴포넌트를 쉽고 유연하게 변경하면서 개발
        
        // Note - 생각
        // 역할 - 인터페이스
        // 구현 - 객체
        // 설계시 역할과 구현을 명확히 분리
        // 역할 먼저 부여하고 구현 객체 만들기
        
        // Note - OCP (Open Close Principle)
        // Open for extension 새로운 기능 추가 변경시, 기존 코드 확장할 수 있어야함.
        // Closed for modification 기존 코드는 수정되지 않아야함
        // -> 기존코드 수정없이 새로운 기능 추가할 수 있어야한다.
        
        // 전략 패턴 (Strategy Pattern)
        // 알고리즘을 클라이언트 코드 변경 없이 쉽게 교채 가능, driver가 클라이언트임
        // car 인터페이스가 전략을 정의하는 인터페이스
        // 각각의 구현체가 전략의 구체적인 구현
        // 그리고 전략을 클라이언트 driver 코드 수정 없이 교체 가능
        
        Driver driver = new Driver();
        
        Car k3 = new K3();
        driver.setCar(k3);
        driver.drive();
        
        Car bmw = new Bmw();
        driver.setCar(bmw);
        driver.drive();
    }
    
}
