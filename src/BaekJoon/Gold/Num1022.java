package BaekJoon.Gold;

import java.util.Scanner;

public class Num1022 {
    public static void main(String[] args) {
        int box [][]= {
                {37, 36, 35, 34, 33, 32, 31},
                {38, 17, 16, 15, 14, 13, 30},
                {39, 18,  5,  4,  3, 12, 29},
                {40, 19,  6,  1,  2, 11, 28},
                {41, 20,  7,  8,  9, 10, 27},
                {42, 21, 22, 23, 24, 25, 26},
                {43, 44, 45, 46, 47, 48, 49},
        };
        Scanner sc = new Scanner(System.in);
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int r2= sc.nextInt();
        int c2= sc.nextInt();

        for(int i=r1+3; i<=r2+3; i++){
            for(int j=c1+3; j<=c2+3; j++){
                if((i==2 || i==3 || i==4) && (j==1 || j==2 || j==3)){
                    System.out.print(box[i][j] + "  ");
                }
                else{
                    System.out.print(box[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
