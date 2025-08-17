package part2_basic.CH9_Polymorphism.part2;

public class Main {
    
    public static void main(String[] args) {
       
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        
        // Note - 다영성 활용1
        animalSound(dog);
        animalSound(cat);
        animalSound(cow);
        
        // Note - 다영성 활용2
        Animal[] animalArr = {dog, cat, cow};
        for (Animal animal : animalArr) {
            animalSound(animal);
        }
        
        
    }
    
    public static void animalSound(Animal animal) {
        animal.sound();
    }
    
}
