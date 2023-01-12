package CNU_ACA_230112.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        // 주사위를 100번 던져서 6이 나올 확률을 구하시오 해보기
        Random r = new Random();
//       long count = Stream.generate(() -> r.nextInt(6)+1)
//                .limit(100)
//                .filter(n -> n==6)
//                .count();
//
//        System.out.println(count + "%");
        //1부터 9까지 곂치지 않게 랜덤하게 세개 추출 해보기
//        int[] arr = Stream.generate(() -> r.nextInt(9)+1)
//                .distinct() //중복 제거
//                .limit(3)
//                .mapToInt(i->i)//그냥 map을 하면 오브젝트 -> 오브젝트(Integer)
//                .toArray();
//
//        System.out.println(Arrays.toString(arr));
//
        //0부터 200 사이 값 중에서 랜덤값 5개를 뽑아 큰 순서대로 표시하시오.
        int[] arr = Stream.generate(() -> r.nextInt(201))
                .limit(5)
                .sorted(Comparator.reverseOrder()) //정렬 , 그냥은 괄호비우면 됨
                .mapToInt(i->i)//그냥 map을 하면 오브젝트 -> 오브젝트(Integer)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
