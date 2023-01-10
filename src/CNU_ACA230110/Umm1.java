package CNU_ACA230110;

import java.util.Scanner;

public class Umm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int i;
        String[] yesOrNo = new String[testCase];
        for(i=0;i<testCase;i++){
            yesOrNo[i] = "YES";
        }
        for(i=0;i<testCase;i++){
            int len = sc.nextInt();
            String [] umm = sc.next().split("");
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(right-left <3){
                yesOrNo[i] = "NO";
                continue;
            }
            if(umm[left-1].equals("U") == false){
                yesOrNo[i] = "NO";
                continue;
            }
            for(;left<=right-1;left++){
                if(umm[left].equals("m") == false){
                    yesOrNo[i] = "NO";
                    break;
                }
            }
        }
        for(i=0;i<testCase;i++){
            System.out.println(yesOrNo[i]);
        }
    }
}
