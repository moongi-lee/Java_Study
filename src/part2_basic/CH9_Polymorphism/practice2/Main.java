package part2_basic.CH9_Polymorphism.practice2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);
        
        // // kakao 결제
        // String payOption1 = "kakao";
        // int amount1 = 5000;
        // payService.processPay(payOption1, amount1);
        // // naver 결제
        // String payOption2 = "naver";
        // int amount2 = 10000;
        // payService.processPay(payOption2, amount2);
        // // 잘못된 결제 수단 선택
        // String payOption3 = "bad";
        // int amount3 = 15000;
        // payService.processPay(payOption3, amount3);
        
        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payMethod =  sc.nextLine();
            
            if (payMethod.equals("exit")) {
                break;
            }
            
            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            // \n 값을 안가져오는 놈이라서 
            // 밑에서 안비워주면 다음 nextLine() 때 자동으로 남은 \n값이 들어감
            
            payService.processPay(payMethod, amount);
            sc.nextLine();
        }
        
        System.out.println("프로그램을 종료 합니다.");
    }
}
