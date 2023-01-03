package CNU_ACA_230103;

public class Class5_3 {
    public int solution(int x, int y) {
        // 코드를 작성하세요
        int[][] array = new int[5][10];
        for(int i=0;i<5;i++)
            for(int j=0;j<10;j++)
            {
                array[i][j] = 2*j + 2;
            }
        return array[x][y];
    }
}

    public class Practice {
    /**
     향상된 for문을 사용해서 1차원 배열 array 원소를 한 줄씩 출력하세요.
     */
    public static void main(String[] args) {
        int [] array = {2, 5, 8, 10, 22, 55, 100};
        for(int i : array){
            System.out.println(i);
        }


    }
}
public class Car {

    void run() {
    }

    // 1. 정수 타입 매개변수 하나를 받는 메소드 run을 추가해보세요.
    void run(int a)
    {
        return;
    }

    // 2. 정수 타입, boolean타입 매개변수 두개를 받는 메소드 run을 추가해보세요.
    void run(int a, boolean b){
        return;
    }

    // 3. String클래스 타입 매개변수 하나를 받고,
    //    결과값으로 boolean타입 false를 반환하는 메소드 run을 추가해보세요.
    boolean run(String a)
    {
        return false;
    }


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car car = new Car();
        car.run(10);
        car.run(10, true);
        boolean result = car.run("테스트");

        System.out.println(result);
    }
}

public class Car {
    int speed;
    boolean operable;
    char grade;

    Car(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    /**
     1. 매개변수를 받지 않는 생성자를 작성합니다.
     - speed는 10, operable은 true, grade는 'B' 값으로 초기화하세요
     */
    Car() {
        this(10,true,'B');
    }
    /**
     2. 매개변수를 speed 하나만 받는 생성자를 작성합니다.
     - operable은 true, grade는 'B' 값으로 초기화하세요
     */
    Car(int speed){
        this(speed,true,'B');
    }
    /**
     3. 매개변수를 speed와 operable 두개를 받는 생성자를 작성합니다.
     - grade는 'B' 값으로 초기화하세요
     */
    Car(int speed, boolean operable){
        this(speed,operable,'B');
    }

    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(20);
        Car car3 = new Car(20, false);
        Car car4 = new Car(20, true, 'A');

        System.out.println(car3.speed);
        System.out.println(car3.operable);
        System.out.println(car3.grade);
    }
}

public class Car {

    /**
     1. 정적 필드를 선언합니다.
     - 필드명은 unit이고 String클래스로 선언하세요.
     - 필드값은 "rpm" 문자열로 초기화하세요.
     */
    static String unit = "rpm";

    /**
     2. 정적 메소드를 선언합니다.
     - 메소드명은 getUnit이고 매개변수 없이 선언하세요.
     - 메소드에서는 1번에서 선언한 필드를 결과값으로 반환합니다.
     */
    static String getUnit()
    {
        return unit;
    }

    public static void main(String[] args) {
        // Car 클래스의 정적 필드 unit을 출력합니다.
        System.out.println(Car.unit);

        // Car 클래스의 정적 메소드를 호출해서 반환되는 결과값을 출력합니다.
        System.out.println(Car.getUnit());
    }
}

public class Car {
    /**
     Car 클래스에 final 필드를 선언하고, 생성자로 필드 값을 초기화하도록 합니다.
     - 정수타입 변수는 speed 필드를 초기화
     - boolean타입 변수는 operable 필드를 초기화
     - char타입 변수는 grade필드를 초기화
     */
    final int speed;
    final boolean operable;
    final char grade;

    Car (int speed,boolean operable,char grade)
    {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car car = new Car(10, false, 'C');

        System.out.println(car.speed);
        System.out.println(car.operable);
        System.out.println(car.grade);
    }
}

public class Car {
    /**
     클래스 상수를 선언하세요. (static final 활용)
     - 필드명은 MAX_RPM
     - 정수 타입으로 선언하고 값은 300으로 초기화합니다.

     */
    static final int MAX_RPM = 300;


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        System.out.println(Car.MAX_RPM);
    }
}