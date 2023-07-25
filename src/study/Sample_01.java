package study;


class Calculator1{
    static int result = 0;

    //add 메서드는 매개변수 num 으로 받은 값을 이전에 계산한 결과값에 더한 후, 돌려주는 메서드이다.
    static int add(int num){
        result += num;

        return  result;
    }

    //빼기 기능을 추가한 메서드
    int sub(int num){
        result -= num;

        return result;
    }
}
//위처럼 클래스를 만든 경우 더하기가 2개이상 필요한 경우, 같은 내용의 클래스를 또 생성해줘야 한다.
class Calculator2{
    static int result = 0;

    //add 메서드는 매개변수 num 으로 받은 값을 이전에 계산한 결과값에 더한 후, 돌려주는 메서드이다.
    static int add(int num){
        result += num;

        return  result;
    }
}




public class Sample_01 {
    public static void main(String[] args) {
        System.out.println(Calculator1.add(3)); //  0 + 3 = 3
        System.out.println(Calculator1.add(4)); //  3 + 4 = 7

        System.out.println(Calculator2.add(3)); // 0 + 3 = 3
        System.out.println(Calculator2.add(7)); // 3 + 7 = 10

        //위처럼 또다른 같은 내용의 클래스를 선언하는게 아닌 객체를 이용하면 하나의 클래스를 가지고
        //여러번 사용할 수 있다.
        Calculator1 cal1 = new Calculator1(); //계산기1 객체 생성
        Calculator1 cal2 = new Calculator1(); //계산기2 객체 생성
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
        //이렇게 실행하여도 위의 결과값과 같다



    }
}
