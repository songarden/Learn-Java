package CNU_ACA230110;

import java.util.Scanner;

public class Umm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int i,j;
        int left,right;
        int[] ummCount = new int[testCase];
        for(i=0;i<testCase;i++){
            ummCount[i] = 0;
        }
        int wrongTest = 0;
        for(i=0;i<testCase;i++){
            int len = sc.nextInt();
            int testCount = sc.nextInt();
            String str = sc.next();
            char[] umm = str.toCharArray();
            for(j=0;j<testCount;j++){
                left = sc.nextInt();
                right = sc.nextInt();
                if(right-left <2){
                    continue;
                }
                if((umm[left-1]=='U') == false){
                    continue;
                }
                for(;left<=right-1;left++){
                    if((umm[left]=='m') == false){
                        wrongTest = 1;
                        break;
                    }
                }
                if(wrongTest == 0){
                    ummCount[i]++;
                }
                wrongTest = 0;
            }

        }
        for(i=0;i<testCase;i++){
            System.out.println(ummCount[i]);
        }
    }
}
