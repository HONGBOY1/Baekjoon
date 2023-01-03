package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int max = sc.nextInt();
        int[] box = new int [n];

        for(int i=0; i<n;i++){
            box[i]= sc.nextInt();
            if(max > box[i]) System.out.print(box[i]+" ");
        }
    }
}
