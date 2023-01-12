package CNU_ACA_230112.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<Integer> s =Arrays.asList(1, 2, 3, 4).stream();
        //제너릭 사용하여 Integer형의 Stream 클래스로 표현
        IntStream s2 = Arrays.stream(new int[]{1, 2, 3});
        //arrays 유틸에 stream이
        //있어서 그안에서 배열을 만들 수 있음
        //primate IntStream 클래스가 따로 있음

        s2.boxed(); //wrapper class로 바꿈
        s2.map(i->Integer.valueOf(i));
        //이렇게 할 경우 intStream이 Stream<Integer>형으로 바뀜
        //둘다 동일
        s2.boxed().collect(Collectors.toList());
        //List 타입으로 결과가 나오게 됨
        s2.boxed().toArray(Integer[]::new);
        //array는 내가 원하는 결과타입으로 생성해주면 됨

        Random r = new Random();

        Stream.generate(r::nextInt) //무한 발생
                .limit(10) //무한 발생하지 않도록 10개로 제한
                .forEach(System.out::println);
        Stream.iterate(0,(i)->i+1)//0부터 시작해서 함수로 간다음
                .limit(10)       //함수의 결과값이 다시 함수로 돌려서 나가는 방식
                .forEach(System.out::println);
    }
}
