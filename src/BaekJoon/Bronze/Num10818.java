package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        int max=0,min=0;
        for(int i=0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {

                min = arr[i];
            }
        }
        System.out.print(min+" "+max);


    }
}
