package CNU_ACA_230105;
import java.util.Scanner;

public class BreadCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bread1 = sc.next();
        int bread1Cost = sc.nextInt();
        String bread2 = sc.next();
        int bread2Cost = sc.nextInt();
        if(bread1Cost > bread2Cost){
            System.out.println(bread1);
        }
        else{
            System.out.println(bread2);
        }
    }
}
