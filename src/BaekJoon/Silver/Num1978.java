package BaekJoon.Silver;

import java.util.Scanner;

public class Num1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=0; i<n;i++){
            int num=sc.nextInt();
            boolean isPrime = true;
            if(num==1)
                continue;
            for(int j = 2; j<=Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                }
            }

            if(isPrime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
