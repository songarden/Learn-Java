package CNU_ACA_230113.optional;

import CNU_ACA_230112.collections.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(26,"손정원");
        //Null을 넣을 순 있지만 그렇게 하지 말기로 약속하자
        //초기값으로 뭔가를 가지고 싶다면?
        User user1 = User.EMPTY;
        
        User user2 = getUser();

        if(user2 == User.EMPTY)
            //이런방식으로 확인
        System.out.println(user);
    }

    private static User getUser() {
        return User.EMPTY;
    }
}
