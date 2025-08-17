package part2_basic.CH9_Polymorphism.part4;

public class Driver {
    
    private Car car;
    
    public void setCar(Car car) {
        this.car = car;
    }
    
    public void drive() {
        car.startEngine();
        car.move();
        car.stopEngine();
    }
}
