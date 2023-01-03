package BaekJoon.Bronze;

import java.util.Scanner;

public class Num17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=n-1; i>=0; i--){
            arr[i]=sc.nextInt();
        }
        int top=0;
        int st[] = new int [n];
        st[top]=arr[0];

        for(int i=1; i<n; i++){
            if(st[top] < arr[i]){
                st[++top] = arr[i];
            }
        }
        System.out.println(top+1);


    }
}
