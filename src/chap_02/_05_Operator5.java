package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {

        //삼항 연산자
        //결과 = (조건) ? (참의 경우 결과값) : (거짓일 경우 결과값)

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y; // x가 y보다 크면 x를 대입, 작으면 y를 대입
        System.out.println(max); // 결과값 : 5

        int min = (x < y) ? x : y; // x가 y보다 작으면 x를 대입, 크면 y를 대입
        System.out.println(min); // 결과값 : 3

        boolean b = (x == y) ? true : false; // x와 y가 같으면 true 반환, 다르면 false 반환
        System.out.println(b); // 결과값 : false

        String s = (x != y) ? "다릅니다" : "같습니다"; // x와 y가 다르면 다릅니다 반환, 같으면 같습니다 반환
        System.out.println(s);

    }
}
