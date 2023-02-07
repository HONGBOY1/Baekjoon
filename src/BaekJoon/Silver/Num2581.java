package BaekJoon.Silver;

import java.util.Scanner;

public class Num2581 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
        int min=10000;
        for(int i=n; i<m+1; i++){
            int c=0;

            for (int j=1; j<=i; j++){
                if(i%j==0)
                    c=c+1;
            }
            if(c==2) {
                sum+=i;
                if(min > i){
                    min = i;
                }
            }
        }

        if(sum !=0 ){
            System.out.println(sum);
            System.out.println(min);
        }
        else{
            System.out.println(-1);
        }

    }
}
