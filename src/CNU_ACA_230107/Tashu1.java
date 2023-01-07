package CNU_ACA_230107;
import java.util.Scanner;
public class Tashu1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int rentNum;
        int returnNum;
        int testCase = sc.nextInt();
        int[] tashuStopNum = new int[testCase];
        int[][] tashuUse = new int[testCase][]; //케이스별 출력 배열
        for(j=0;j<testCase;j++){
            tashuStopNum[j] = sc.nextInt();
            tashuUse[j] = new int[tashuStopNum[j]]; //2중배열 크기 선언
            for(i=0;i<tashuStopNum[j];i++){
                tashuUse[j][i] = sc.nextInt();
            }
            int useCount = sc.nextInt();
            for(i=0;i<useCount;i++){
                rentNum = sc.nextInt();
                returnNum = sc.nextInt();
                tashuUse[j][rentNum-1]--;
                tashuUse[j][returnNum-1]++;
            }
        }
        for(i=0;i<testCase;i++){
            for(j=0;j<tashuStopNum[i];j++){
                System.out.print(tashuUse[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
