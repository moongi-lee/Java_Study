package part2_basic.CH9_Polymorphism.part3;

public class Cow2 extends AbsoluteAbstractAnimal {
    
    @Override
    public void sound() {
        System.out.println("음매");
    }
    
    @Override
    public void move() {
        System.out.println("저벅저벅");
    }
}
