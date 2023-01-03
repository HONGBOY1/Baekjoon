package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, K;
        int cnt=0;
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();

        while(N >=2 && M >=1 && N+M - 3 >= K)
        {
            N-=2;
            M--;
            cnt++;
        }
        System.out.println(cnt);

    }
}
