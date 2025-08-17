package part2_basic.CH9_Polymorphism.practice1;

public class Email implements Sender{
    
    @Override
    public void send() {
        System.out.println("email send");
    }
}
