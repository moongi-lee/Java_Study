package part2_basic.CH9_Polymorphism.part3;

import part2_basic.CH9_Polymorphism.part1.Child;
import part2_basic.CH9_Polymorphism.part2.Animal;

public class Main {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        
        AbstractAnimal[] animalArr = {dog, cat, cow};
        
        for (AbstractAnimal animal : animalArr) {
            animalSound(animal);
            animalMove(animal);
        }
        
        Dog2 dog2 = new Dog2();
        Cat2 cat2 = new Cat2();
        Cow2 cow2 = new Cow2();
        
        AbsoluteAbstractAnimal[] animalArr2 = {dog2, cat2, cow2};
        
        for (AbsoluteAbstractAnimal animal : animalArr2) {
            animalSound(animal);
            animalMove(animal);
        }
        
        Dog3 dog3 = new Dog3();
        Cat3 cat3 = new Cat3();
        Cow3 cow3 = new Cow3();
        
        InterfaceAnimal[] animalArr3 = {dog3, cat3, cow3};
        
        for (InterfaceAnimal animal : animalArr3) {
            animalSound(animal);
            animalMove(animal);
            
            animal.fly();
        }
        
        System.out.println(InterfaceAnimal.PI);
        
        
        InterfaceA interfaceA = new DiamondChild();
        InterfaceB interfaceB = new DiamondChild();
        
        interfaceA.methodA();
        ((DiamondChild)interfaceA).methodB();
        
        interfaceB.methodB();
        interfaceA.methodCommon();
        interfaceB.methodCommon();
        
        
    }
    
    private static void animalSound(AbstractAnimal animal) {
        animal.sound();
    }
    
    private static void animalMove(AbstractAnimal animal) {
        animal.move();
    }
    
    private static void animalMove(AbsoluteAbstractAnimal animal) {
        animal.move();
    }
    
    private static void animalSound(AbsoluteAbstractAnimal animal) {
        animal.sound();
    }
    
    private static void animalMove(InterfaceAnimal animal) {
        animal.move();
    }
    
    private static void animalSound(InterfaceAnimal animal) {
        animal.sound();
    }
}

