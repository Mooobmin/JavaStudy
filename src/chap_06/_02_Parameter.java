package chap_06;

public class _02_Parameter {

    public static void power(int number){
        int result = number * number;
        System.out.println(number + " 의 2 승은" + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

    }
}
