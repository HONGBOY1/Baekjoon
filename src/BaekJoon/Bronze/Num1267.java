package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,Y=0,M=0;
        int time;
        N=sc.nextInt();
        for(int i=0; i<N;i++){
            time = sc.nextInt();
            Y += ((time / 30) + 1) * 10;
            M += ((time / 60) + 1) * 15;
        }

        if(M==Y){
           System.out.println("Y M "+M);
        }
        else if(M < Y) {
            System.out.println("M "+M);
        }
        else if(M > Y){
            System.out.println("Y "+Y);
        }
    }
}
