package part2_basic.CH9_Polymorphism.part1;

public class Child extends Parent {
    
    String value = "Child";
    
    public void childMethod() {
        System.out.println("child method");
    }
    
    public void eat() {
        System.out.println("child eat");
    }
    
}
