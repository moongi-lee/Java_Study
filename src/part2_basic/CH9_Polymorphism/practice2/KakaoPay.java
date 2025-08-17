package part2_basic.CH9_Polymorphism.practice2;

public class KakaoPay implements Pay {
    
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오 페이 " + amount + "원 결제");
        return true;
    }
}
