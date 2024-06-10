package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int happyCnt = (str.length() - str.replace(":-)", "").length()) / 3;
        int sadCnt = (str.length() - str.replace(":-(", "").length()) / 3;

        if(happyCnt == sadCnt && happyCnt == 0 && sadCnt == 0){
            System.out.println("none");
        }
        else if(happyCnt > sadCnt){
            System.out.println("happy");
        }
        else if(happyCnt < sadCnt){
            System.out.println("sad");
        }
        else if(happyCnt == sadCnt){
            System.out.println("unsure");
        }
    }
}
