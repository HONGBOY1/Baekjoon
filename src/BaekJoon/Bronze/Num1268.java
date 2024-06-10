package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(); // 학생수
        int [][] box = new int[N][5];
        int [] cnt = new int[N];
        for(int i=0; i<N; i++){
            for(int j=0;j <5 ; j++){
                box[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<5; j++){
                for(int k=0; k<N;k++){
                    if(box[i][j]==box[k][j] && i!=k){
                        cnt[k]++;
                    }
                }
            }
        }
        int max=0;
        for(int i=0; i<N; i++){
            if(cnt[i] > max){
                max=i;
            }
        }
        System.out.println(max);
    }
}
