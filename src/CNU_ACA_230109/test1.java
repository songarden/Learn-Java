package CNU_ACA_230109;


import java.util.Scanner;
import java.text.DecimalFormat;
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase;
        DecimalFormat df = new DecimalFormat("0.0#");
        int i;
        double mileOrKilo;
        String kOrM;
        testCase = sc.nextInt();
        double[] testResult = new double[testCase];
        for(i=0;i<testCase;i++){
            mileOrKilo = sc.nextInt();
            kOrM = sc.next();
            if(kOrM.equals("K")){
                testResult[i] = mileOrKilo / 1.6;
                System.out.println("K done with" + testResult[i]);
            }
            else if(kOrM.equals("M")){
                testResult[i] = mileOrKilo * 1.6;
                System.out.println("M done with" + testResult[i]);
            }
        }
        for(i=0;i<testCase;i++){
            testResult[i] = Math.round(testResult[i]*100)/100.0;
        }
        String[] resultPoint = new String[testCase];
        for(i=0;i<testCase;i++){
            resultPoint[i] = df.format(testResult[i]);
            System.out.println(resultPoint[i]);

        }
    }
}
