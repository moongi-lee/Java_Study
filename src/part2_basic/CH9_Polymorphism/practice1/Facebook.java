package part2_basic.CH9_Polymorphism.practice1;

public class Facebook implements Sender{
    
    @Override
    public void send() {
        System.out.println("facebook send");
    }
}
