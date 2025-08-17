package part2_basic.CH8_Extend;

public class Main {
    
    public static void main(String[] args) {
        
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.openDoor();
        electricCar.charge();
        
        // Note - 기본
        // 자바는 단일 상속 구조이다.
        // 여러 상속이 필요한경우 인터페이스를 이용한다.
        
        // 상속관계 객체 생성시 힙영역에 부모,자식 객체 모두 생성된다.
        // 상속 관계 객체 호출시, 호출자의 타입을 통해 힙메모리의 대상을 찾아간다.
        // 현제 타입에서 기능을 찾지 못하면 상위 타입으로 찾으러간다. 끝까지 없으면 컴파일 오류
        
        // Note - 오버라이딩
        // 메서드이름, 매개변수, 반환타입 같아야함
        // 접근제어자 - 상위 클래스의 메서드 보다 더 제한적이면 안된다.
        // 메서드 자체가 static, final, private 키워드가 붙으면 오버라이딩 불가능하다.
        // 예외 - 상위 클래스 메서드보다 더 많은 체크 예외를 throws로 선언 할수 없다.
        // 저 적거나 같은수, 또는 하위 타입의 예외는 선언 가능
    }
}
