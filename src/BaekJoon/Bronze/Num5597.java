package BaekJoon.Bronze;

import java.util.Scanner;

public class Num5597 {
    public static void main(String[] args) {
        int arr[] = new int[31];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<28; i++){
            int s=sc.nextInt();
            arr[s]=s;
        }
        for(int i=1; i<=30; i++){
            if(arr[i]==0){
                arr[i]=i;
                System.out.println(arr[i]);
            }
        }
    }
}
