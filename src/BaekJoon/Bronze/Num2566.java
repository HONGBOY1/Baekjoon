package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dab=0;
        int x=1,y=1;
        int arr[][]  = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(dab < arr[i][j]){
                    dab=arr[i][j];
                    x=i+1;
                    y=j+1;
                }
            }
        }
        System.out.println(dab);
        System.out.println(x+" "+y);
    }
}
