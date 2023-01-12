package CNU_ACA_230112.stream;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("A","BC","DEF")
                .stream()
                .map(String::length)
                .filter(i->i%2==1)
                .forEach(System.out::println); //stream에 많은 기능들이 담겨 있음
    } //Collections 과 다른 점 : 한 원소별로 동작함
}
