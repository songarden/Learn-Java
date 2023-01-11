package CNU_ACA_230111;

public class Generater2 {
    public static void main(String[] args) {
        new Generater2().loop(10, System.out::println);
    }

    void loop(int n, MyConsumer<Integer> consumer){
        for(int i=0;i<n;i++){
            //consumer
            consumer.consume(i); //consume 메소드 명시는 아직 안되 있으므로
                                //위의 psvm문에서 정의 후 사용
        }
    }
}
