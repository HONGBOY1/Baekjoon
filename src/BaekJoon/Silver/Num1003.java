package BaekJoon.Silver;


import java.util.Scanner;

public class Num1003 {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        int n= sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            fibonacci(num);
            System.out.println(dp[num][0]+" "+dp[num][1]+"\n");
        }

    }
    static Integer[] fibonacci(int n) {
        if(dp[n][0]==null || dp[n][1]==null){
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return dp[n];
    }
}
