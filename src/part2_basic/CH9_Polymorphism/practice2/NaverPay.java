package part2_basic.CH9_Polymorphism.practice2;

public class NaverPay implements Pay {
    
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버 페이 " + amount + "원 결제");
        return true;
    }
}
