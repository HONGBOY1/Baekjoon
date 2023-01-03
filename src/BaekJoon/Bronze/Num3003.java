package BaekJoon.Bronze;

import java.util.Scanner;

public class Num3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chess[] = {1,1,2,2,2,8};
        int input[] = new int [6];
        int sum[] =  new int [6];


        for(int i=0; i< 6 ; i++){
            input[i]=sc.nextInt();
        }
        for(int i=0; i<chess.length; i++){
            sum[i]=chess[i]-input[i];
            System.out.print(sum[i]+" ");
        }
    }
}
