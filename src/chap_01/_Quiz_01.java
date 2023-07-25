package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        /**************************************************************************************
         퀴즈 1. 버스 도착 정보를 출력하는 프로그램을 작성하시오. (각 정보는 적절한 자료형의 변수에 정의합니다.)
         **************************************************************************************
         실행 결과
         상암08번 버스
         약 3분 후 도착
         남은 거리 1.2km
         *************************************************************************************/
        String busNumber = "상암08"; //버스 번호
        int remaining_time = 3;     //남은 시간
        double remaining_distance = 1.2; // 남은 거리

        System.out.println(busNumber + " 번 버스");
        System.out.println("약 "+remaining_time + "분 후 도착");
        System.out.println("남은 거리 " + remaining_distance+"km");
    }
}
