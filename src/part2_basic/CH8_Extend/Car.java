package part2_basic.CH8_Extend;

public class Car {
    
    private int distance;
    
    public void move() {
        System.out.println("move");
    }
    
    public void openDoor() {
        System.out.println("open door");
    }
    
    public Car() {
        // this(100);
        System.out.println("car constructor.");
    }
    
    public Car(int distance) {
        this.distance = distance;
        System.out.println("car constructor.");
    }
    
}
