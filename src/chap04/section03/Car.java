package chap04.section03;

class Car{
    void run(){
        System.out.println("차가 달립니다.");
    }

    void printSpeed(int speed) {
        System.out.println("현재 속도는 " + speed + " 입니다.");
    }

    boolean isCar() {
        return true;
    }

    public static void main(String[] args) {
        // Car클래스로부터 인스턴스를 생성하세요.

        Car car = new Car();


        // Car객체의 run 메소드를 호출해보세요.

        car.run();


        // Car객체의 printSpeed 메소드를 호출해보세요. (인자로 정수값 10을 넘깁니다)

        car.printSpeed(10);


        // Car객체의 isCar 메소드를 호출해보세요. (반환된 값은 boolean타입 변수 result에 저장합니다)

        boolean result = car.isCar();


        System.out.println(result);
    }
}



