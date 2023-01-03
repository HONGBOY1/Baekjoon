package BaekJoon.Bronze;

import java.util.Scanner;

public class Num23253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int list[][];
        int chk[]= new int[n];

        for(int i=0;i<m;i++){
            int num=sc.nextInt();
            list = new int [m][num];
            for(int j=0;j<num; j++){
                list[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
        }
    }
}
