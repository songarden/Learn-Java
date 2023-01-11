package CNU_ACA_230111;

@FunctionalInterface
public interface MyRunnable {
    void run(); //추상 메소드가 하나밖에 없는 인터페이스 == 함수형 인터페이스
}
@FunctionalInterface
interface MyMap {
    void map(); //추상 메소드가 역시 하나밖에 없으므로 함수형 인터페이스
    default void sayHello(){
        System.out.println("Hello world");
    }
    static void sayBye(){
        System.out.println("Bye World");
    }
}
