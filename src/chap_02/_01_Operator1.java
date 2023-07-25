package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 결과 : 6 (덧셈)
        System.out.println(4 - 2); // 결과 : 2 (뺄셈)
        System.out.println(4 * 2); // 결과 : 8 (곱셈)
        System.out.println(4 / 2); // 결과 : 2 (나눗셈)

        System.out.println(5 / 2); // 결과 : 2 (정수형이기 때문에 소숫점은 나오지 않음)
        System.out.println(2 / 4); // 결과 : 0
        System.out.println(4 % 2); // 결과 : 0 (나머지)
        System.out.println(5 % 2); // 결과 : 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);   // 결과 : 6 (곱셈 먼저 계산)
        System.out.println((2 + 2) * 2); // 결과 : 8 (괄호 먼저 계산)
        System.out.println(2 + (2 * 2)); // 결과 : 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 결과 : 30

        c = a - b;
        System.out.println(c); // 결과 : 10

        c = a * b;
        System.out.println(c); // 결과 : 200

        c = a / b;
        System.out.println(c); // 결과 : 2

        c = a % b;
        System.out.println(c); // 결과 : 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);   // 결과 : 10
        System.out.println(++val); // 결과 : 11 (연산을 먼저 처리 한다.)

        val = 10;
        System.out.println(val);   // 결과 : 10
        System.out.println(val++); // 결과 : 10 (문장을 먼저 처리 한다.)
        System.out.println(val);   // 결과 : 11 (위에서 처리한 연산 결과가 반영된다.)

        val = 10;
        System.out.println(val);   // 결과 : 10
        System.out.println(--val); // 결과 : 9 (연산을 먼저 처리한다.)

        val = 10;
        System.out.println(val);   // 결과 : 10
        System.out.println(val--); // 결과 : 10 (문장을 먼저 처리한다.)
        System.out.println(val);   // 결과 : 9  (위에서 처리한 연선 결과가 반영된다.


        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);  // 결과 : 대기인원 : 0
        System.out.println("대기 인원 : " + waiting++);  // 결과 : 대기인원 : 1
        System.out.println("대기 인원 : " + waiting++);  // 결과 : 대기인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 결과 : 총 대기인원 : 3

    }
}
