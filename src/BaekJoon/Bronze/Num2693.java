package BaekJoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Num2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int[] arr = new int [10];
            for(int j=0; j<10; j++){
                arr[j]= sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }

}
