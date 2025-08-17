package part2_basic;

import java.util.Date;

// Note - Final 클래스
// 더이상 상속 불가능

final public class CH7_Final {
    
    // final
    // 클래스 - 상속 불가능
    // 메소드 - 오버라이딩 불가능
    // 참조값 - 다른 참조 객체 할당 불가능
    // 지역변수 - 다른값 불가능
    // 상수 - 다른값 불가능
    // 맴버변수 - 다른값 불가능
    
    // Note - Fianl 맴버 변수
    // 생성자 혹은 직접 할당으로 딱 1번만 값 할당 가능
    final int value = 1;
    final int value2;
    
    // Note - 상수 (Static Final)
    // 어차피 static을 고정으로 쓸꺼라면 매모리 낭비 하지 않고 static으로 만드는것
    static final double PIE = 3.14;
    
    // Note - Final 참조값
    // 이럴경우 객체 내부의 속성들은 변경가능하지만 date라는 변수에 다른 객체 참조값을 할당이 불가능함
    final Date date = new Date();
    
    public CH7_Final(int value2) {
        this.value2 = value2;
        
    }
    
    // Note - Final 메소드
    // 하위 객체에서 오버라이딩을 금지시킴
    public final void test() {
        System.out.println( "test");
    }
    
    
    static void main() {
        // Note - Final 지역변수
        
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; //컴파일 오류
        
        final int data2 = 10;
        // data2 = 20; //컴파일 오류
        
    }
    
    static void method(final int parameter) {
        // parameter = 20; 컴파일 오류
    }
    
    
    
    
}
