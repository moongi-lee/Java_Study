package part1_base;

public class CH3_Condition1 {
    
    public static void main(String[] args) {
        // if, else if, else
        
        // switch (단순히 값이 같은지만 비교 가능함 대신 더 간단함)
        int grade = 2;
        
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            default:
                coupon = 500;
        }
        
        // 신문법 switch 는 뒤에서 더 자세하게 다룬다.
        coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 500;
        };
        
        // 삼항연산자
        int age = 19;
        String status = (age >= 18) ? "성인" : "미성년자";
    }
}
