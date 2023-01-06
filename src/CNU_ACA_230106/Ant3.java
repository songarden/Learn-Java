package CNU_ACA_230106;
import java.util.Scanner;

public class Ant3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line;
        int punch;
        int testCount;
        int startNum = 0;
        int finishNum = 0;
        int infinityG = 0;
        int wallCount = 0;
        int j;
        testCount = sc.nextInt(); //첫번째 입력값 T
        String [] junsik = new String[testCount];
        for(int a=0;a<testCount;a++){
            junsik[a] = "HAHA!";
        }
        for(int i=0;i<testCount;i++){
            line = sc.nextInt(); //두번째 입력값 N
            punch = sc.nextInt(); //두번째 입력값 M
            String [] dimention = sc.next().split(""); //N짜리 문자열 S
            for(j=0;j<line;j++){
                if(dimention[j].equals("@")){
                    startNum = j;
                    continue;
                }
                if(dimention[j].equals("O")){
                    finishNum = j;
                    continue;
                }
                if(dimention[j].equals("G")){
                    infinityG = j;  //인피니티 건틀릿 위치
                }
            }
            if(startNum > infinityG){
                for(;infinityG<startNum;infinityG++) {
                    if (dimention[infinityG + 1].equals("#")) {
                        wallCount++;
                    }
                }
            }
            else{
                for(j = startNum;j<infinityG;j++){
                    if(dimention[j + 1].equals("#")){
                        wallCount++;
                    }
                }
            }
            if(wallCount <= punch){
                wallCount = 0;
                continue;
            }
            wallCount = 0;
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
