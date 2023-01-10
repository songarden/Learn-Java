package CNU_ACA230110;

import java.util.Scanner;

import static java.lang.Math.floor;

public class ThanosSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int i,j;
        int[] arrNum = new int[testCase];
        int[][] arr = new int[testCase][];
        for(i=0;i<testCase;i++){
            arrNum[i] = sc.nextInt();
            arr[i] =new int[arrNum[i]];
            for(j=0;j<arrNum[i];j++){
                arr[i][j] = sc.nextInt();
            }
            for(j=arrNum[i]-1;j>0;j--){
                while(arr[i][j] < arr[i][j-1] == true){
                    arr[i][j-1] = arr[i][j-1]/2;
                }
            }
            System.out.println("While 문 Finish");
        }
        for(i=0;i<testCase;i++){
            for(j=0;j<arrNum[i];j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
