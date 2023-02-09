package BaekJoon.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int m= sc.nextInt();
        int min= 0;
        int max=0;

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }

        while (min < max) {
            long sum=0;
            int mid = (min+max)/2;
            for (int i = 0; i < n; i++) {
                if(mid < arr[i]) sum+=arr[i]-mid;
            }
            if(sum < m){
                max = mid;
            }
            else {
                min = mid+1;
            }
        }
        System.out.println(min -1);
    }
}
