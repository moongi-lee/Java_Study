package part2_basic.CH9_Polymorphism.part3;

public class Cat3 implements InterfaceAnimal {
    
    @Override
    public void sound() {
        System.out.println("야옹");
    }
    
    @Override
    public void move() {
        System.out.println("살금살금");
    }
}
