package part2_basic.CH9_Polymorphism.part3;

public class Cat2 extends AbsoluteAbstractAnimal {
    
    @Override
    public void sound() {
        System.out.println("야옹");
    }
    
    @Override
    public void move() {
        System.out.println("살금살금");
    }
}
