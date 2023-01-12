package CNU_ACA_230112.collections;

public class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }



    public boolean isOver19() {
        return age >= 19;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }// toString을 재정의함
}
