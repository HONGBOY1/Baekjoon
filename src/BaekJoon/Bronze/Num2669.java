package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2669 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int arr[][] = new int [101][101];

        for(int i=0; i<4; i++){

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int a=y1; a<y2; a++){
                for(int b=x1; b<x2; b++){
                    arr[a][b]=1;
                }
            }
        }
        int cnt =0;
        for(int i=0; i<101; i++){
            for(int j=0;j <101; j++){
                if(arr[i][j] >= 1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
