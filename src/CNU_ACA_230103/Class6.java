package CNU_ACA_230103;

public class Class6 {

}
public class Car {
    int speed;
    boolean operable;
    char grade;

    // this를 사용해서 생성자를 작성하세요. 매개변수명은 speed, operable, grade로 선언합니다.
    public Car(int speed, boolean operable, char grade)
    {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car car = new Car(10, true, 'A');

        System.out.println(car.speed);
        System.out.println(car.operable);
        System.out.println(car.grade);
    }
}