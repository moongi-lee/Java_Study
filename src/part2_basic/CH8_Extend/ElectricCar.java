package part2_basic.CH8_Extend;

public class ElectricCar extends Car {
    
    public void charge() {
        System.out.println("charge.");
    }
    
    @Override
    public void move() {
        System.out.println("electric car move.");
    }
    
    @Override
    public void openDoor() {
        super.openDoor();
        System.out.println("electric car open door.");
    }
    
    public ElectricCar(int distance) {
        super(distance);
        System.out.println("electric car constructor.");
    }
    
    public ElectricCar() {
        // Note - 기본 생성자
        // 자식 클래스는 생성자 안에 언젠가 반드시 한번 부모 생성자 호출 해야됨
        // 부모 클래스 생성자가 기본생성자 인경우 생략 가능하다.
        // 기본 생성자가 없는경우는 반드시 super(x) 로 부모 생성자 사용해야함.
        // 가장 첫줄에 부모 생성자 호출이 이루어져야 한다.
        // super();
        System.out.println("electric car constructor.");
        
        // Note - 원리
        // 힙영역에 부모 객체 우선 순위로 차례대로 객체가 생성된다.
    }
    
}
