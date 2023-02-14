package BaekJoon.Silver;

import java.util.Scanner;

public class Num1654 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int allCnt = sc.nextInt();
        int arr[] = new int[n];

        long max = 0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(max < arr[i]){
                max=arr[i];
            }
        }
        max++;
        long min = 0;
        long mid = 0;
        while (min < max){
            mid = (max+min)/2;
            long cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += (arr[i] / mid);
            }
            if(cnt < allCnt) max = mid;
            else  min = mid+1;
        }
        System.out.println(min - 1);
    }
}
