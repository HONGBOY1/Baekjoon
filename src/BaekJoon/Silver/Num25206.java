package BaekJoon.Silver;

import java.util.Scanner;

public class Num25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumNumxScore = 0;
        double sumNum = 0;

        double sum=0.0;
        for(int i =0; i<20; i++){
            double score=0;
            String str =sc.nextLine();
            String [] strArr = str.split(" ");
            if( !(strArr[2].equals("P"))) {
                switch (strArr[2]) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }
                sumNumxScore += (Double.parseDouble(strArr[1])*score);
                sumNum += Double.parseDouble(strArr[1]);
            }
        }
        System.out.printf("%.6f", sumNumxScore/sumNum);
    }
}
