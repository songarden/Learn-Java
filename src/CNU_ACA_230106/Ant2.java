package CNU_ACA_230106;
import java.util.Scanner;

public class Ant2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line;
        int punch;
        int testCount;
        int startNum = 0;
        int finishNum = 0;
        int wallCount = 0;
        testCount = sc.nextInt(); //첫번째 입력값 T
        String [] junsik = new String[testCount];
        for(int a=0;a<testCount;a++){
            junsik[a] = "HAHA!";
        }
        for(int i=0;i<testCount;i++){
            line = sc.nextInt(); //두번째 입력값 N
            punch = sc.nextInt(); //두번째 입력값 M
            String [] dimention = sc.next().split(""); //N짜리 문자열 S
            for(int j=0;j<line;j++){
                if(dimention[j].equals("@")){
                    startNum = j;
                    continue;
                }
                if(dimention[j].equals("O")){
                    finishNum = j;
                }
            }
            if(startNum > finishNum){
                for(;finishNum<startNum;finishNum++){
                    if(dimention[finishNum+1].equals("#")){
                        wallCount++;
                    }
                    if(wallCount > punch){
                        junsik[i] = "HELP!";
                        break;
                    }
                }
            }
            else{
                for(;startNum<finishNum;startNum++){
                    if(dimention[startNum+1].equals("#"))
                    {
                        wallCount++;
                    }
                    if(wallCount > punch){
                        junsik[i] = "HELP!";
                        break;
                    }
                }
            }
            wallCount = 0;
        }
        for(int l=0;l<testCount;l++)
        {
            System.out.println(junsik[l]);
        }
    }
}
