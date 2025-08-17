package part1_base;

public class CH5_Scope1 {
    
    public static void main(String[] args) {
        
        // Note - 지역변수, 맴버변수(클래스변수, 인스턴스변수)
        // 지역변수 - 코드블록이 끝난경우 사용 불가능
        // 비효율적인 메모리 사용을 피하기위해 , 코드 복잡성을 줄이기 위해 도입됨.
        
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        } // x 생존 종료
        // System.out.println("main x = " + x); //오류, 변수 x에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료
}
