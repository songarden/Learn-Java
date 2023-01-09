package CNU_ACA_230109;

import java.util.Scanner;

public class Ant4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line;
        int j;
        int punch;
        int testCount;
        int startNum = 0;
        int[] finishNum = new int[7];
        int finishCount = 1;
        int wallCount = 0;
        int sikStr;
        int sikHp;
        int monstStr;
        int monstHp;
        int monstGps = 8;
        Boolean alive = true;
        testCount = sc.nextInt(); //첫번째 입력값 T
        String [] junsik = new String[testCount];
        for(int a=0;a<testCount;a++){
            junsik[a] = "HELP!";
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
                    finishNum[finishCount] = j;
                    finishCount++;
                }
                if(dimention[j].equals("&")){
                    monstGps = j;
                }
            }
            sikStr = sc.nextInt();
            sikHp = sc.nextInt();
            monstStr = sc.nextInt();
            monstHp = sc.nextInt();

            for(j=0;j<finishCount;j++){
                if(startNum > finishNum[j]){
                    for(;finishNum[j]<startNum;finishNum[j]++){
                        if(dimention[finishNum[j]+1].equals("#")){
                            wallCount++;
                        }
                        if(finishNum[j] == monstGps){
                            while(true){
                                monstHp -= sikStr;
                                if(monstHp <= 0){
                                    alive = true;
                                    break;
                                }
                                sikHp -= monstStr;
                                if(sikHp <= 0){
                                    alive = false;
                                    break;
                                }
                            }
                        }
                        if(wallCount > punch){
                            alive = false;
                            break;
                        }
                    }

                }
                else{
                    for(;startNum<finishNum[j];startNum++){
                        if(dimention[startNum+1].equals("#"))
                        {
                            wallCount++;
                        }
                        if(startNum == monstGps){
                            while(true){
                                monstHp -= sikStr;
                                if(monstHp <= 0){
                                    alive = true;
                                    break;
                                }
                                sikHp -= monstStr;
                                if(sikHp <= 0){
                                    alive = false;
                                    break;
                                }
                            }
                        }
                        if(wallCount > punch){
                            alive = false;
                            break;
                        }
                    }
                }
                if(alive == true){
                    junsik[i] = "HAHA!";
                    break;
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
