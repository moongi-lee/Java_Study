package part2_basic.CH9_Polymorphism.practice1;

public class Sms implements Sender{
    
    @Override
    public void send() {
        System.out.println("sms send");
    }
}
