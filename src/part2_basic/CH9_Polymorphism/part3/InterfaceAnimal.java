package part2_basic.CH9_Polymorphism.part3;

public interface InterfaceAnimal {
    
    // 인터페이스
    // 순수 추상클래스
    // 인스턴스 생성불가능
    // 상속시 모든 메서드 오버라이딩
    // 다형성을 위해 사용
    
    // ++
    // 인터페이스의 모든 메서느든 public, abstract 이다. 따라서 생략 가능 (권장)
    // 다중 구현(다중 상속)지원
    
    // ++
    // 맴버변수는 무조건 public static final 포함되어있다고 간주된다. (생략 권장)
    double PI = 3.14;
    public static final int MAX_AGE = 100;
    
    void sound();
    void move();
    
    
    // Note - default, private 키워드는 예외적으로 인터페이스 내부에서 구현 가능하다.
    default void fly() {
        System.out.println("fly");
        flyHigh();
    }
    
    private void flyHigh() {
        System.out.println("펄럭 펄럭");
    }
}
