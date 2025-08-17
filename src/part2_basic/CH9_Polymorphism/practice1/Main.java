package part2_basic.CH9_Polymorphism.practice1;

public class Main {
    
    public static void main(String[] args) {
        
        Sender[] senders = {new Email(), new Sms(), new Facebook()};
        for (Sender sender : senders) {
            sender.send();
        }
    }
}
