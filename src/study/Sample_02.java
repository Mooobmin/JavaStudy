package study;


//가장 간단한 클래스의 형태
//클래스의 선언만 있고 내용이 없는 껍데기 클래스 이지만
//이는 클래스에서 가장 중요한 객체를 만드는 기능을 가진다.
class Animal{
    //객체 변수
    String name;
    public void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println(this.name + "zzz");
    }

}
public class Sample_02 {
    public static void main(String[] args) {
        //cat은 객체 / cat은 Animal의 인스턴스
        // 과자틀 : Class (Animal)
        // 과자틀로 만든 과자 : 객체(Object = cat)
        // 이처럼 위에서 만든 Animal 을 통하여 수많은 동물 객체들을 만들 수 있다.
        Animal cat = new Animal();
        cat.setName("검은고양이");


        Animal dog = new Animal();
        dog.setName("검은 강아지");

        Animal horse = new Animal();
        horse.setName("검은말");

        //객체 변수의 값은 독립적으로 유지된다.
        //하지만 static을 통해 공유하도록 만들 수 있다.

        System.out.println(dog.name);
        System.out.println(cat.name);
        System.out.println(horse.name);


        Dog dog1 = new Dog();
        dog1.setName("초코");
        System.out.println(dog1.name);
        dog1.sleep();
        }
    }

