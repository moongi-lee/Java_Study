package part2_basic.CH9_Polymorphism.part3;

public class DiamondChild implements InterfaceA, InterfaceB {
    
    @Override
    public void methodA() {
        System.out.println("methodA");
    }
    
    @Override
    public void methodB() {
        System.out.println("methodB");
    }
    
    // 각 인터페이스 메소드 이름이 같아도
    // 어차피 무조건 구현해야하기때문에 자식에서 어떻게 구현할지 결정이 가능해서 오류없이 다중 구현 가능
    @Override
    public void methodCommon() {
        System.out.println("methodCommon");
    }
}
