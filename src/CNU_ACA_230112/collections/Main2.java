package CNU_ACA_230112.collections;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        new MyCollection<User>(
                Arrays.asList(
                        new User(15,"AAA"),
                        new User(16,"AAB"),
                        new User(17,"AAC"),
                        new User(18,"AAD"),
                        new User(19,"AAE"),
                        new User(20,"AAF"),
                        new User(21,"AAG"),
                        new User(22,"AAH"),
                        new User(23,"AAI")
                )
        )
                .filter(User::isOver19)
                .foreach(System.out::println);
                //-> user클래스의 메소드의 toString을 바꿔서 표현을 바꿈
    }
}
