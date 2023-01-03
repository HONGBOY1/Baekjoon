package BaekJoon.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num11399 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] time = new int[n];
        for(int i=0; i<n; i++){
            time[i]=sc.nextInt();
        }
        Arrays.sort(time);
        int sum=0;
        int wait_time=0;
        for (int i=0; i<n; i++) {
            wait_time += time[i];
            sum += wait_time;
        }
        System.out.println(sum);
    }
}
