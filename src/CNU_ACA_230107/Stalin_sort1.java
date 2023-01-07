package CNU_ACA_230107;
import java.util.Scanner;


public class Stalin_sort1 {
    public static void main(String[] args){
//        List<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(45);
//        System.out.println(numbers);
//
//        numbers.remove(1);
//        numbers.remove(new Integer(3));
//        System.out.println(numbers);
        Scanner sc = new Scanner(System.in);
        int i,j;
        int testCase = sc.nextInt();
        int[][] stalinSort1 = new int[testCase][];
        int[] arrayNum = new int[testCase];
        for(i=0;i<testCase;i++){
            arrayNum[i] = sc.nextInt();
            stalinSort1[i] = new int[arrayNum[i]];
            for(j=0;j<arrayNum[i];j++){
                stalinSort1[i][j] = sc.nextInt();
            }
        }
        int orm = 0;
        for(i=0;i<testCase;i++) {
            System.out.print(stalinSort1[i][0] + " ");
            for (j = 1; j < arrayNum[i]; j++) {
                for(int k=0;k<j;k++){
                    if (stalinSort1[i][k] > stalinSort1[i][j]) {
                        orm = 1;
                        break;
                    }
                }
                if(orm == 1){
                    orm = 0;
                    continue;
                }
                System.out.print(stalinSort1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
