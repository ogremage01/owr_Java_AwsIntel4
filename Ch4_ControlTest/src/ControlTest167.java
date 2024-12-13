import java.util.Scanner;

/**
 * 키보드로부터 정수를 입력받아서 그 수까지의 
 * 피보나치 수열을 출력하는 프로그램
 */
public class ControlTest167 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int num = scan.nextInt();

        int a = 0, b = 1; // 피보나치의 첫 두 항
        int count = 0; // 출력할 항의 수를 카운트

        while (count < num) {
            System.out.print(a + (count < num - 1 ? "\t" : ""));
            int next = a + b; // 다음 피보나치 수
            a = b; // 이전 값 갱신
            b = next; // 다음 값 갱신
            count++; // 카운트 증가
        }
        
        scan.close(); // 스캐너 자원 해제
    }
}