package CNU_ACA_230103;

public class Class7 {
    public class GenesisCar
            extends Car
    {
        public static void main(String[] args) {
            // GenesisCar 클래스로부터 인스턴스를 생성해서 변수로 선언합니다.

            GenesisCar car = new GenesisCar();


            // 상속받은 부모클래스의 turnOn메소드를 호출합니다.

            car.turnOn();

        }
    }

    class Car {
        void turnOn() {
            System.out.println("엔진을 켰습니다");
        }

        void turnOff() {
            System.out.println("엔진을 껐습니다");
        }
    }

    public class GenesisCar extends Car{
        int price;

        /**
         1. 매개변수 4개를 받는 생성자 선언하기
         - super를 사용해서 부모 클래스의 필드를 초기화하세요.
         */
        GenesisCar(int speed, boolean operable, char grade, int price) {
            super(speed,operable,grade);
            this.price = price;
        }


        /**
         2. 매개변수 3개를 받는 생성자 선언하기
         - super를 사용해서 부모 클래스의 필드를 초기화하세요.
         - price는 0으로 초기화하세요
         - (또는 this를 사용해서 생성자 오버로딩으로 완성해도 됩니다.)
         */
        GenesisCar(int speed, boolean operable, char grade) {
            super(speed,operable,grade);
            this.price = 0;
        }


        /**
         3. 매개변수 2개를 받는 생성자 선언하기
         - super를 사용해서 부모 클래스의 필드를 초기화하세요.
         - price는 0으로 초기화하세요
         */
        GenesisCar(int speed, boolean operable) {
            super(speed,operable);
            this.price = 0;
        }


        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        public static void main(String[] args) {
            GenesisCar genesisCar = new GenesisCar(150, true);
            System.out.println(genesisCar.speed);
            System.out.println(genesisCar.operable);
            System.out.println(genesisCar.grade);
            System.out.println(genesisCar.price);
        }
    }


    class Car {
        int speed;
        boolean operable;
        char grade;

        Car(int speed, boolean operable) {
            this(speed, operable, 'B');
        }

        Car(int speed, boolean operable, char grade) {
            this.speed = speed;
            this.operable = operable;
            this.grade = grade;
        }
    }

    public class GenesisCar extends Car{
        GenesisCar() {
            super(150, true, 'A');
        }

        /**
         부모 클래스 Car의 run 메소드를 오버라이딩합니다.
         1. "제네시스" 문자열을 출력한 뒤
         2. 부모 클래스의 run 메소드를 호출합니다.
         */
        @Override
        public void run(){
            System.out.println("제네시스");
            super.run();
        }

        public static void main(String[] args) {
            GenesisCar genesisCar = new GenesisCar();
            genesisCar.run();
        }
    }

    class Car {
        int speed;
        boolean operable;
        char grade;

        Car(int speed, boolean operable, char grade) {
            this.speed = speed;
            this.operable = operable;
            this.grade = grade;
        }

        void run() {
            System.out.println("차가 달립니다.");
        }
    }

    //오버라이딩
    public class GenesisCar extends Car{
        GenesisCar() {
            super(150, true, 'A');
        }

        /**
         부모 클래스 Car의 run 메소드를 오버라이딩합니다.
         1. "제네시스" 문자열을 출력한 뒤
         2. 부모 클래스의 run 메소드를 호출합니다.
         */
        @Override
        public void run(){
            System.out.println("제네시스");
            super.run();
        }

        public static void main(String[] args) {
            GenesisCar genesisCar = new GenesisCar();
            genesisCar.run();
        }
    }

    class Car {
        int speed;
        boolean operable;
        char grade;

        Car(int speed, boolean operable, char grade) {
            this.speed = speed;
            this.operable = operable;
            this.grade = grade;
        }

        void run() {
            System.out.println("차가 달립니다.");
        }
    }

    //추상클래스
    /*
    1. Car 추상 클래스를 상속받고, 추상 메소드를 구현하세요.
        - turnOn 메소드에서는 "제네시스 시동을 켰습니다." 문자열을 출력합니다.
        - turnOff 메소드에서는 "제네시스 시동을 껐습니다." 문자열을 출력합니다.
*/
    public class GenesisCar extends Car {
        GenesisCar(){
            super();
        }
        @Override
        public void turnOn(){
            System.out.println("제네시스 시동을 켰습니다.");
        }
        @Override
        public void turnOff(){
            System.out.println("제네시스 시동을 껐습니다.");
        }
        public static void main(String[] args) {
            //아래는 실행을 위한 코드입니다. 수정하지 마세요.
            GenesisCar genesisCar = new GenesisCar();
            genesisCar.turnOn();
            genesisCar.turnOff();
        }
    }

    abstract class Car {
        /*
            2. 추상 메소드를 선언하세요.
                - 메소드명 : turnOn, turnOff
                - (둘다 결과를 반환하지 않습니다)
        */
        abstract void turnOn();
        abstract void turnOff();

    }

    //클래스 형변환
    public class GenesisCar extends Car{
        int price;

        GenesisCar(int speed, boolean operable, char grade, int price) {
            super(speed, operable, grade);

            this.price = price;
        }

        @Override
        public void turnOn() {
            System.out.println("제네시스 시동을 켰습니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("제네시스 시동을 껐습니다.");
        }

        public static void main(String[] args) {
            /**
             1. GenesisCar인스턴스를 생성하고, Car클래스로 자동 타입 변환 선언합니다.
             - GenesisCar 인스턴스 생성 시, 인자를 아래와 같이 대입해주세요.
             - speed : 300
             - operable : true
             - grade : 'A'
             - price : 8000
             */
            Car car = new GenesisCar(300,true,'A',8000);

            // 2. 자동 타입 변환한 인스턴스에서 turnOn메소드를 호출합니다.
            car.turnOn();
            // 3. 자동 타입 변환한 인스턴스에서 turnOff메소드를 호출합니다.
            car.turnOff();
            // 4. 자동 타입 변환한 인스턴스에서 speed필드를 출력합니다. (System.out.println 활용)
            System.out.println(car.speed);
            // 5. car 인스턴스를 GenesisCar클래스로 강제 타입 변환합니다.
            GenesisCar car2 = (GenesisCar) car;
            // 6. 강제 타입 변환한 인스턴스에서 price필드를 출력합니다. (System.out.println 활용)
            System.out.println(car2.price);
        }
    }

    abstract class Car {
        public int speed;
        public boolean operable;
        public char grade;

        Car(int speed, boolean operable, char grade) {
            this.speed = speed;
            this.operable = operable;
            this.grade = grade;
        }

        public abstract void turnOn();
        public abstract void turnOff();
    }
}
