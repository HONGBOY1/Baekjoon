package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] card = new int[5];
        int[] save = new int[N];
        int sum=0;
        for(int i=0; i<N;i++){
            for (int j = 0; j < 5; j++) {
                card[j] = sc.nextInt();
            }

            for(int j=0;j<3; j++){
                for(int k=j+1;k<4; k++){
                    for(int z=k+1; k<5; k++){
                        sum= card[j] + card[k] + card[z] % 10;
                    }
                }
            }

        }
        int cnt=0;
        for(int i=0;i<N-1;i++){
            if(save[i]>save[i+1]) cnt=i;
        }
        System.out.println(cnt+1);
    }

}
