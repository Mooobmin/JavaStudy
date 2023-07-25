package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {

        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true 이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 true 이면 true

        // AND 연산
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다 (false)

        // OR 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나, 3은 1보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나, 3은 1보다 작다 (false)

        // System.out.println(1 < 3 < 5); 연속 비교는 불가능
        System.out.println(1 < 3 && 3 < 5); //연속비교는 아래처럼 하되, 굳이 괄호가 없어도 된다. 가독성을 높이기 위해 괄호를 써주면 좋다.

        // 논리 부정 연산자 (서로 결과값을 뒤집음)
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println(5 == 5); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true



    }
}
