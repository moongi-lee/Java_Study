package part2_basic;

public class CH4_Constroctor_C {
    
    int age;
    String name;
    
    
    CH4_Constroctor_C(int age) {
        this(age, "홍길동");
        System.out.println("test");
    }
    
    CH4_Constroctor_C(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
