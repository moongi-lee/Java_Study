package part2_basic.CH9_Polymorphism.part4;

public class K3 implements Car{
    
    @Override
    public void startEngine() {
        System.out.println("k3 시동");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("k3 정지");
    }
    
    @Override
    public void move() {
        System.out.println("k3 이동");
    }
}
