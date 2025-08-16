package part1_base.ch2_operator;

public class Operator1 {
    
    public static void main(String[] args) {
        
        // 산술 연산자 +, -, *, /, %
        
        // 증감 연산자 ++, -- (전위, 후위)
        // 전위
        int a = 1;
        int b = 0;
        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);
        // 후위
        a = 1;
        b = 0;
        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);
        
        // 비교 연산자 ==, !=, >, <, >=, <=
        // 논리 연산자 &&, ||, !
        // 대입 연산자 =, +=, -=, *=, /=, %=
    }
    
}
