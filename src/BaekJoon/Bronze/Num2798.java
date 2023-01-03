package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),max= sc.nextInt();
        int [] num = new int[n];
        int sum=0;
        int temp=0;
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        /// 브루트포스 알고리즘
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n;k++){
                    sum=num[i]+num[j]+num[k];
                    if(temp < sum &&sum <= max){
                        temp=sum;
                    }
                }
            }
        }
        System.out.println(temp);
    }

}
