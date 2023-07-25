package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {

        //대입 연산자
        int num = 10;

        num = num + 2;
        System.out.println(num); //  결과 : 12

        num = num -2;
        System.out.println(num); // 결과 : 10

        num = num * 2;
        System.out.println(num); // 결과 : 20

        num = num / 2;
        System.out.println(num); // 결과 : 10

        num = num % 2;
        System.out.println(num); // 결과 : 0

        //복합 대입 연산자
        num = 10;

        num += 2; // num = num + 2; 와 동일한 표기법
        System.out.println(num); // 결과값 : 12

        num -= 2; // num = num - 2; 와 동일한 표기법
        System.out.println(num); // 결과값 : 10

        num *= 2; // num = num * 2; 와 동일한 표기법
        System.out.println(num); // 결과값 : 20

        num /= 2; // num = num / 2; 와 동일한 표기법
        System.out.println(num); // 결과값 : 10

        num %= 2; // num = num % 2; 와 동일한 표기법
        System.out.println(num); // 결과값 : 0
    }
}
