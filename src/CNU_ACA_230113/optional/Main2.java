package CNU_ACA_230113.optional;

import CNU_ACA_230112.collections.User;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        //User user = User.EMPTY;
        //EMPTY 코드의 문제성은 이를 약속한 집단만이 EMPTY 코드를 대처할 수 있음

        Optional<User> optionalUser = Optional.empty(); //empty시 NULL
        //NULL이 담긴 바구니로 wrapping하여 전달하는 방식
        optionalUser = Optional.of(new User(20,"garden"));

        optionalUser.isEmpty();
        optionalUser.isPresent();
        //이를 이용하여 아래와 같이 코딩할 수 있게 된다

        if(optionalUser.isPresent()){
            //.....
        }
        else{
            //....
        }
        // => 아예 위와같은 코딩 형식으로 계속 수행해야 하니까
        // => 아래와 같은 기능을 통해 코드를 최소화하게 됨.

        optionalUser.ifPresent(user -> {
            //.....
        });
        optionalUser.ifPresentOrElse(user -> {
            //.....
        }, () -> {
            // ....
        });
        //모두 같은 표현이다.
    }
}
