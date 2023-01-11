package CNU_ACA_230111;

public class LambDa {
    public static void main(String[] args) {
//        new MyRunnable(){
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }.run();
        //위 형식을 밑으로 축약
        //익명 메소드를 사용해서 표현하는 방법 : 람다 표현법
        MySupply<String> s = () -> "Hello World"; //<> generator
        MyMapper<String,Integer> m = String::length;
        MyRunnable r = () -> System.out.println(m.map(s.Supply()));
        r.run();

    }
}
