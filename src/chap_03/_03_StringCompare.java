package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true
        System.out.println(s1.equals(s2)); // 다르면 false

        System.out.println(s2.equals("python")); // 대소문자 구분하기 때문에 대소문자도 같아야 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자만 같으면 true

        //문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용) * 자바에서 문자의 내용을 비교하려면 equals()을 사용하라
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2);      // false 서로 저장되어 있는 메모리 공간이 다르기 때문에 false 가 출력되는 것.
    }
}
