package part2_basic.CH9_Polymorphism.part1;

public class Main {
    
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println("Parent -> Parent \n");
        
        Child child = new Child();
        child.childMethod();
        System.out.println("Child -> Child \n");
        
        // Note - 기본
        // 참조 변수가 부모만 담을수 있는 변수로 되어있으니 당연히 자식 객체 함수 못씀.
        // 메모리 크기 떄문에 자식 객체를 담을 수는 있지만 해당 기능에는 접근 불가능
        // 부모는 자식, 자식의 자식 을 참조 할수 있다. 이것이 다형적 참조 이다.
        Parent poly = new Child();
        poly.parentMethod();
        System.out.println("Parent -> Child \n");
        // poly.childMethod();
        
        // Note - 다운 케스팅
        // 부모를 자식으로 다운 케스팅 하면 기능 사용 가능하다. 메모리에는 생성되어 있기 떄문
        ((Child) poly).childMethod();
        // ((Child) parent).childMethod(); // 이건 생성자체가 부모로 되서 런타임 애러 발생함.
        System.out.println("Parent ->casting-> Child \n");
        
        // Note - 업케스팅
        // 자식을 부모로 업케스팅 하는것, 이런경우는 생략 가능하다.
        
        // 자식 메모리는 부모 생성자로만 생성이 불가능함, 자기 자신이 생성되지 않기 떄문
        // Child poly2 = new Parent();
        
        // Note - poly3 instance of Child
        // 이걸로 다운캐스팅 안전한지 확인후 자식 기능 수행
        // A가 B의 인스턴스 라고 볼수 있나?
        // Parent poly3 = new Child(); (O)
        // Parent poly3 = new Parent(); (X)
        
        
        // Note - 오버라이딩
        // 메소드는 오버라이딩 되고 항상 우선순위를 가짐
        // 속성은 오버라이딩 되지 않음
        Parent poly4 = new Child();
        poly4.eat();
        System.out.println(poly4.value);
    }
    
}
