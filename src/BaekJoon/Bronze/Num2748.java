package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2748 {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long arr[] = new long[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<arr.length; i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        System.out.println(arr[n]);
    }

}
