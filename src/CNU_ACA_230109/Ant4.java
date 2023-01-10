package CNU_ACA_230109;

import java.util.Scanner;

public class Ant4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line;
        int j,a;
        int punch;
        int testCount;
        int startNum = 0;
        int[] finishNum = new int[7];
        int finishCount = 0;
        int wallCount = 0;
        int sikStr, sikStrTemp;
        int sikHp, sikHpTemp;
        int monstStr, monstStrTemp;
        int monstHp, monstHpTemp;
        int monstGps = 0;
        int startNumTemp;
        Boolean alive;
        testCount = sc.nextInt(); //첫번째 입력값 T
        String [] junsik = new String[testCount];
        for(a=0;a<testCount;a++){
            junsik[a] = "HELP!";
        }
        for(int i=0;i<testCount;i++){
            alive = true;
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
                    continue;
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
                alive = true;
                wallCount = 0;
                startNumTemp = startNum;
                int finishNumTemp = finishNum[j];
                sikHpTemp = sikHp;
                sikStrTemp = sikStr;
                monstHpTemp = monstHp;
                monstStrTemp = monstStr;
                System.out.println("Wall Count = " + wallCount);
                if(startNum > finishNum[j]){
                    for(;finishNumTemp<startNum;finishNumTemp++){
                        if(dimention[finishNumTemp+1].equals("#")){
                            wallCount++;
                            System.out.println("Wall Count+ = " + wallCount);
                        }
                        if(finishNumTemp == monstGps){
                            while(true){
                                monstHpTemp -= sikStrTemp;
                                if(monstHpTemp <= 0){
                                    alive = true;
                                    System.out.println("Junsik Win !");
                                    break;
                                }
                                sikHpTemp -= monstStrTemp;
                                if(sikHpTemp <= 0){
                                    alive = false;
                                    System.out.println("Moster Win !");
                                    break;
                                }
                            }
                        }
                        if(wallCount > punch){
                            alive = false;
                            System.out.println("Wall help!");
                            break;
                        }
                    }
                }
                else{
                    for(;startNumTemp<finishNum[j];startNumTemp++){
                        if(dimention[startNumTemp+1].equals("#"))
                        {
                            wallCount++;
                            System.out.println("Wall Count += " + wallCount);
                        }
                        if(startNumTemp == monstGps){
                            while(true){
                                monstHpTemp -= sikStrTemp;
                                if(monstHpTemp <= 0){
                                    alive = true;
                                    System.out.println("Junsik Win !");
                                    break;
                                }
                                sikHpTemp -= monstStrTemp;
                                if(sikHpTemp <= 0){
                                    alive = false;
                                    System.out.println("Moster Win !");
                                    break;
                                }
                            }
                        }
                        if(wallCount > punch){
                            alive = false;
                            System.out.println("Wall help!");
                            break;
                        }
                    }
                }
                if(alive == true){
                    junsik[i] = "HAHA!";
                    System.out.println("I saved");
                    break;
                }
            }
            finishCount = 0;

        }
        for(int l=0;l<testCount;l++)
        {
            System.out.println(junsik[l]);
        }
    }
}