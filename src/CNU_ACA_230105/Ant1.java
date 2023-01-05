package CNU_ACA_230105;
import java.util.Scanner;

public class Ant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = 7;
        int punch = 1; //한번 부술 수 있는 기회
        char[] dimention1 = new char[line];
        String input = sc.nextLine();
        for(int j=0;j<line;j++) {
            dimention1[j] = input.charAt(j);
        }
        for(int i=1;i<6;i++){
            if(punch == 0 && dimention1[i] == '#'){ //펀치횟수가 0이 되면 못 탈출함
                System.out.println("HELP!");
                return;
            }
            if(dimention1[i] == '#'){
                punch--; // #만날때 펀치 깎으며 지나가기
            }
        }
        System.out.println("HAHA!");
    }
}
