package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if(n>m){
            long tmp = n;
            n = m;
            m = tmp;
        }
        System.out.println(n==m ? 0 :m-n-1);
        for(long i=n+1; i<m; i++){
            System.out.print(i+" ");
        }

    }
}
