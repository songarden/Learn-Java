package chap04.section03;

public class Car3 {
    int speed;
    boolean operable;
    char grade;

    /**
     Car 생성자를 선언하고 매개변수을 받아 해당하는 필드를 초기화합니다.
     - 정수타입 변수는 speed 필드를 초기화
     - boolean타입 변수는 operable 필드를 초기화
     - char타입 변수는 grade필드를 초기화
     */
    public Car3(int a, boolean b, char c){
        speed = a;
        operable = b;
        grade = c;
    }

    public static void main(String[] args) {
        /**
         Car인스턴스를 생성합니다. 생성자 매개변수 순서에 맞춰 아래의 인자를 함께 전달하세요.
         - speed필드는 정수값 10
         - operable필드는 boolean타입 true
         - grade필드는 char타입 'A'
         */
        Car3 car = new Car3(10,true,'A');

        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        System.out.println(car.speed);
        System.out.println(car.operable);
        System.out.println(car.grade);
    }
}
