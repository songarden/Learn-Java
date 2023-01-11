package CNU_ACA_230111;

import java.util.Arrays;
import java.util.Scanner;

public class Jkm1 {
    public static void main(String[] args) {
        //중요한건 꺾이지 않는 마음 !
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int i,j;
        String [] testResult = new String[testCase];
        Arrays.fill(testResult,"JB");
        for(i=0;i<testCase;i++){
            int dayCount = sc.nextInt();
            int upperCost = sc.nextInt();
            int buyDay = sc.nextInt();
            int[] tesla = new int[dayCount];
            for(j=0;j<dayCount;j++){
                tesla[j] = sc.nextInt();
            }
            for(j=buyDay-1;j<dayCount;j++){
                if(tesla[buyDay-1]+upperCost <= tesla[j]){
                    testResult[i] = String.valueOf(j+1);
                    break;
                }
            }
        }
        for(i=0;i<testCase;i++){
            System.out.println(testResult[i]);
        }
    }
}
