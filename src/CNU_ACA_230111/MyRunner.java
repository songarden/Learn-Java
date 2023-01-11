package CNU_ACA_230111;


class SayHello implements MyRunnable{

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
public class MyRunner {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
              MySupply s = new MySupply(){
                  @Override
                  public String Supply() {
                      return "Hello World";
                  }
              };
                System.out.println(s.Supply());
            }
        };
        r.run();
    }
}
