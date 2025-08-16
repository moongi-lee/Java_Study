package part1_base.ch7_array;

public class Array1 {
    
    public static void main(String[] args) {
        
        // 초기화1
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        
        // 초기화2
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        
        // 초기화3
        int[] arr3 = {1, 2, 3, 4, 5};
        
        int[] arr4;
        arr4 = new int[]{1, 2, 3, 4, 5};
        // arr4 = {1, 2, 3, 4, 5}; // 이방법은 인라인으로 선언 초기화 한번에 할떄만 가능
        
        
        // int형 변수 5개 가 만들어짐
        
        // Note - 초기화
        // 배열은 생성시 자동으로 변수를 초기화함
        // 숫자는 0, boolean은 false, String은 null 로 초기화
        
        // Note - 메모리 접근
        // arr1 변수에는 해당 배열의 맨 앞 메모리 주소 보관중
        // 인덱스와 맨앞 매모리주소를 사용해 각 메모리에 접근
    }
}
