package BaekJoon.Silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Num2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []  = new int[n];
        double sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println((int) Math.round(sum/n));
        System.out.println(arr[n/2]);
        int cnt[] = new int[8001];
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            cnt[arr[i]+4000]++;
            max = Math.max(cnt[arr[i]+4000], max);
        }
        ArrayList<Integer> max_idx = new ArrayList<>();
        for(int i=0; i<=8000; i++)
            if(max == cnt[i])
                max_idx.add(i-4000);
        System.out.println(max_idx.size()>1? max_idx.get(1) : max_idx.get(0));
        System.out.println(arr[arr.length-1] - arr[0]);
    }
}
