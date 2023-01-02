package chap04.section03;

public class Car {
    public boolean isCar() {
        return true;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.isCar());
    }
}
