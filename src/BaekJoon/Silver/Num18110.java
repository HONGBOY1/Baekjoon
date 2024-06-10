package BaekJoon.Silver;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  =Integer.parseInt(br.readLine());
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        double p=(n*15.0)/100.0;
        int num=(int) Math.round(p);
        int sum=0;
        for(int i = num; i<n-num; i++){
            sum+=arr[i];
        }
        System.out.println(Math.round(sum/(n-(num*2.0))));
    }
}
