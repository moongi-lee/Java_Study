package part1_base.ch8_method;

public class Method1 {
    
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        // Part1 - 기본
        // 5, 10 은 인수
        // a, b 는 파라미터(매개변수) (메서드 정의할때 선언한 변수)
        // 메소드 호출시 넘긴 인수가 파라미터에 할당 된다.
        
        // Note - 항상 변수의 값을 복사에서 파라미터에 넣는다.
        // primitive 형식의 값은 진짜 그 값이 복사된다.
        // reference 형식의 값은 참조값이 복사된다.
        int sum2 = add(10, 20);
        
        String test = "안녕";
        addStr(test);
        System.out.println(test);
        
    }
    
    
    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("a + b = " + sum);
        return sum;
    }
    
    public static void addStr(String a) {
        // a += " 하세요";
        a = "미안요";
    }
    
    // Part - 오버로딩
    // 메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
    // 시그니처가 다르면 개별 메소드로 쓸 수 있음
    // 이름이 같은경우 매개변수 타입, 갯수, 순서가 달라야함.
    
}
