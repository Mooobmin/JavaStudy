package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int number){
        String result = data.substring(0, number);
        for (int i = 0; i < data.length()-number; i++) {
            result += "*";
        }

        return result;
    }



    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; //주민번호
        String phone = "010-1234-1234"; //전화번호

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));


    }
}
