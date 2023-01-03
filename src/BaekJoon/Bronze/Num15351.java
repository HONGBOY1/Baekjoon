package BaekJoon.Bronze;

import java.util.Scanner;

public class Num15351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int n = Integer.parseInt(temp);
        for(int i=0; i<n;i++){
            int sum=0;
            String str = sc.nextLine();
            String restr=str.replaceAll("\\s+","");;
            for(int j=0; j<restr.length(); j++){
                sum+=restr.charAt(j)-64;
            }
            if(sum==100) System.out.println("PERFECT LIFE");
            else System.out.println(sum);
        }
    }
}
