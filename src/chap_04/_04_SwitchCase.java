package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        //석자에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 제외

        int ranking = 4; // 등수
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if(ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 제외");
        }
        System.out.println("조회 완료 #1");

        //Switch Case 문으로 변환
        ranking = 5;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 제외");
        }
        System.out.println("조회 완료#2");

        //Switch Case 문에서 중복되는 부분이 있을 때
        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2, 3: //콤마로 중복되는 케이스도 같이 작성하면 된다.
                System.out.println("반액 장학금");
                break;

            /* case 2:
               case 3: //혹은 위 케이스에서 브레이크문을 걸지 않고, 다음 케이스를 바로 작성해도 된다.
                System.out.println("반액 장학금");
                break;*/

            default:
                System.out.println("장학금 대상 제외");
        }
        System.out.println("조회 완료#3");

        //중고상품 등급에 따른 가격 책정 (ex : 1급 : 최상, 4급 : 최하)
        int grade = 2; //등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 : " + price + "원");
        // 1등급 제품 가격 : 10000원
        }
}
