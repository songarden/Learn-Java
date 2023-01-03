package CNU_ACA_230103;

public class Class4_11 {
    /**
     길이가 5인 정수형 배열 array를 만들어보세요.
     - 변수명은 array 입니다.
     - array 요소는 1, 2, 3, 4, 5 순으로 저장해야 합니다.
     */
    public int[] makeArray() {
        // 배열 변수 array를 선언 & 초기화하세요.
        int[] array = {1,2,3,4,5};
        return array;
    }

    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[]args) {
        Class4_11 practice = new Class4_11();
        int [] array = practice.makeArray();
        if(array.length==5 &&
                array[0] ==1 &&
                array[1] ==2 &&
                array[2] ==3 &&
                array[3] ==4 &&
                array[4] ==5){
            System.out.println("정답입니다. [제출]을 누르세요.");
        }
        else{
            System.out.println("틀렸습니다.");
        }
    }
}
