package CNU_ACA_230105;

public class LargestNumFind {
    class Solution {
        public int[] solution(int[][] array) {
            int[] answer = new int[array.length];
            for(int i=0;i<array.length;i++){
                answer[i] = array[i][0];
            }
            for(int j=0;j<array.length;j++){
                for(int k = 1;k<array[j].length;k++){
                    if(array[j][k] > array[j][k-1])
                        answer[j] = array[j][k];
                }
            }
            return answer;
        }

    }

    //정답 예
//    class Solution1 {
//        public int[] solution(int[][] array) {
//            int[] answer = new int[array.length];
//            int idx = 0;
//
//            for (int[] arr : array) {
//                int max = 0;
//                for (int val : arr) {
//                    if (max < val) {
//                        max = val;
//                    }
//                }
//                answer[idx] = max;
//                idx++;
//            }
//
//            return answer;
//        }
//    }
}
