package CNU_ACA_230111;


interface MyInterface{ //추상 메소드로만 이뤄진 클래스 == 인터페이스
    void method1();
    default void sayHello() { //default 라는 키워드를 써서 구현 가능하게 함
        System.out.println("Hello World");
    }
}
public class DefInterface implements MyInterface {
    public static void main(String[] args) {
        new DefInterface().sayHello();
    }

    @Override
    public void method1() {
        throw new RuntimeException();
    }
}
