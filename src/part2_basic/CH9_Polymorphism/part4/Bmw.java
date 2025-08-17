package part2_basic.CH9_Polymorphism.part4;

public class Bmw implements Car{
    
    @Override
    public void startEngine() {
        System.out.println("bmw 시동");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("bmw 정지");
    }
    
    @Override
    public void move() {
        System.out.println("bmw 이동");
    }
}
