package BaekJoon.Bronze;

import java.util.Scanner;

public class Num4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            int m= sc.nextInt();
            double sum=0;
            int arr[] = new int[m];
            for(int j=0;j<m; j++) {
                int val = sc.nextInt();	// 성적 입력
                arr[j] = val;
                sum += val;
            }
            double avg=sum/m;
            double cnt=0;
            for(int j=0;j<m; j++) {
                if(arr[j] > avg) {
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f",(cnt/m)*100)+"%");
        }
    }
}
