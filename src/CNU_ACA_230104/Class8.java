package CNU_ACA_230104;

public class Class8 {
    //인터페이스 만들기

    // Practice클래스는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    class Practice {
        public static void main(String[] args) {
            TV tv = new LedTV();
            tv.on();
            tv.off();
            System.out.println(TV.UNIT);
        }
    }


    /**
     TV 인터페이스를 구현하세요 (문제 설명에 있는 내용대로 구현합니다)
     */
    interface TV{
        public static final String UNIT = "inch";

        public abstract void on();
        public abstract void off();
    }


    // LedTV클래스는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    class LedTV implements TV{
        @Override
        public void on(){
            System.out.println("켜다");
        }
        @Override
        public void off(){
            System.out.println("끄다");
        }
    }

    //인터페이스로 클래스 구현하기
    public class Practice {
        public static void main(String[] args) {
            TV tv = new SmartTV();
            tv.on();
            tv.off();
        }
    }

    interface TV {
        public static final String UNIT = "inch";
        public abstract void on();
        public abstract void off();
    }


    /**
     TV인터페이스를 구현하는 SmartTV클래스를 작성하세요.
     - on 메소드를 구현할 땐, 실행블록 내용에 "스마트TV를 켜다" 문자열을 출력합니다
     - off 메소드를 구현할 땐, 실행블록 내용에 "스마트TV를 끄다" 문자열을 출력합니다
     */
    class SmartTV implements TV{
        @Override
        public void on(){
            System.out.println("스마트TV를 켜다");
        }
        @Override
        public void off(){
            System.out.println("스마트TV를 끄다");
        }
    }

    //인터페이스 사용하기
    public class Practice {

        public static void test(TV tv) {
            tv.on();
            tv.off();
        }

        public static void main(String[] args) {
            /**
             1. SmartTV 인스턴스를 생성해서 TV 타입 변수 tv1에 대입합니다.
             2. test메소드를 호출합니다. 인자로 tv1 변수를 넣어보세요.
             */
            TV tv1 = new SmartTV();
            test(tv1);

            /**
             3. LedTV 인스턴스를 생성해서 TV 타입 변수 tv2에 대입합니다.
             4. test메소드를 호출합니다. 인자로 tv2 변수를 넣어보세요.
             */
            TV tv2 = new LedTV();
            test(tv2);

        }
    }

    interface TV {
        public static final String UNIT = "inch";
        public abstract void on();
        public abstract void off();
    }

    class LedTV implements TV{
        @Override
        public void on(){
            System.out.println("LED TV를 켜다");
        }
        @Override
        public void off(){
            System.out.println("LED TV를 끄다");
        }
    }

    class SmartTV implements TV{
        @Override
        public void on(){
            System.out.println("스마트TV를 켜다");
        }
        @Override
        public void off(){
            System.out.println("스마트TV를 끄다");
        }
    }

    //인터페이스 default, static, private 메소드
    public class Practice {
        public static void main(String[] args) {
            TV tv = new SmartTV();

            // default 메소드 describe를 호출하세요. 인자로 문자열 "Smart"를 넣습니다.

            tv.describe("Smart");


            // static 메소드 showSize를 호출하세요. 인자로 숫자 10을 넣습니다.

            TV.showSize(10);

        }
    }

    interface TV {
        public static final String UNIT = "inch";

        // default 메소드를 선언하세요.

        default
        void describe(String name) {
            //  빈칸에 private 메소드 getName을 호출하세요.
            System.out.println(
                    getName(name)
                            + " 입니다.");
        }

        // private 메소드를 선언하세요.

        private
        String getName(String name) {
            return name + " TV";
        }

        // static 메소드를 선언하세요.

        static
        void showSize(int inch) {
            // 빈칸에 private static 메소드 getSize를 호출하세요.
            System.out.println("TV 사이즈는 " +
                    getSize(inch)
                    + " 입니다.");
        }

        // private static 메소드를 선언하세요.

        private static
        String getSize(int inch) {
            return inch + UNIT;
        }

    }

    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    class SmartTV implements TV{

    }
}
