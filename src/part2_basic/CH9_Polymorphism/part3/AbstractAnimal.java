package part2_basic.CH9_Polymorphism.part3;

abstract public class AbstractAnimal {
    // 추상 클래스
    // 생성자로 직접 객체 생성 불가능 , 인스턴스 생성 불가능
    // 추상 메서드가 1개라도 있으면 반드시 추상 클래스로 선언해야함.
    
    // 추상 메서드
    // 부모클래스를 상속받는 자식이 반드시 오버라이딩 해야하는 메서드
    // 구현은 반드시 자식이 해야해서 여기에 구현내용 작성 불가능하다.
    
    public abstract void sound();
    
    public void move() {
        System.out.println("move");
    }
}
