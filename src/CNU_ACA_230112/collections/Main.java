package CNU_ACA_230112.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(); //LinkedList가 List 인터페이스로 구상이 되있음
        List<Integer> list2 = new ArrayList<>();

//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        for(int i=0;i<list1.size();i++){
//            System.out.println(list1.get(i));
//        }

//        new MyCollection<>(Arrays.asList(1,2,3,4,5)) //타입 들어오는 것에 따라 형식 맞춰짐
//                .foreach(System.out::println); //람다 표현식 -> 메소드 레퍼런스

        MyCollection<String> c1 = new MyCollection<>(Arrays.asList("A1","Ccd","B123d"));
        MyCollection<Integer> c2 = c1.map(String::length);

        c1.foreach(System.out::println);
        c2.foreach(System.out::println);

        //위를 바로 실행하면 다음과 같다
        new MyCollection<>(Arrays.asList("A1","Ccd","B123d"))
                .map(String::length)
                .foreach(System.out::println);

        //filter 적용
        new MyCollection<>(Arrays.asList("A1","Ccd","B123d"))
                .map(String::length)
                .filter(i->i%2==0)
                .foreach(System.out::println);

        //size 적용
        int s = new MyCollection<>(Arrays.asList("A1","Ccd","B123d"))
                .map(String::length)
                .filter(i->i%2==1)
                .size();

        System.out.println(s);


    }
}
