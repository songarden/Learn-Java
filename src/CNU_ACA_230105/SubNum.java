package CNU_ACA_230105;
import java.util.Scanner;
public class SubNum {
    public static void main(String[] args){
        int arrayAdd1;
        int arrayAdd2;
        int questionNum;

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            array[i] = sc.nextInt();
        }
        questionNum = sc.nextInt();
        int[] arrayAdd = new int[questionNum];
        for(int i=0;i<questionNum;i++)
        {
            arrayAdd[i] = 0;
            arrayAdd1 = sc.nextInt();
            arrayAdd2 = sc.nextInt();
            if(arrayAdd1 == arrayAdd2){
                arrayAdd[i] = array[arrayAdd1-1];
            }
            else if(arrayAdd1 > arrayAdd2){
                for(;arrayAdd2<=arrayAdd1;arrayAdd2++){
                    arrayAdd[i] += array[arrayAdd2-1];
                }
            }
            else{
                for(;arrayAdd1<=arrayAdd2;arrayAdd1++){
                    arrayAdd[i] += array[arrayAdd1-1];

                }

            }

        }
        for(int j = 0;j<questionNum;j++){
            System.out.println(arrayAdd[j]);
        }
    }
}
