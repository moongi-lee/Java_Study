package part2_basic.CH9_Polymorphism.part3;

public class Dog2 extends AbsoluteAbstractAnimal {
    
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    
    @Override
    public void move() {
        System.out.println("후다닥");
    }
}
