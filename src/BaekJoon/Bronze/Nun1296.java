package BaekJoon.Bronze;

import java.util.Scanner;

public class Nun1296 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x; i++){
            int count=0;
            int n=sc.nextInt();
            int m=sc.nextInt();
            for (int j=n;j<=m;j++) {
                String str = Integer.toString(j);
                String arr[] = str.split("");
                for (int k = 0; k < str.length(); k++) {
                    if (arr[k].equals("0")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
