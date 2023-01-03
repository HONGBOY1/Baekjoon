package BaekJoon.Silver;

import java.util.Scanner;

public class Num2578 {
    static int cnt=0;
    static  int[][] bingGo ;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        bingGo = new int [5][5];
        for(int i=0; i< 5; i++){
            for(int j=0;j<5; j++){
                bingGo[i][j] = sc.nextInt();
            }
        }
        for(int a=1; a<=25; a++){
            int num=sc.nextInt();
            for(int i=0; i< 5; i++){
                for(int j=0;j<5; j++){
                    if(bingGo[i][j]==num){
                        bingGo[i][j]=0;
                    }
                }
            }
            width();
            length();
            Rcrr();
            Lcrr();

            if(cnt>=3){
                System.out.println(a);
                break;
            }
            cnt=0;
        }

    }

   public static void width(){
        for(int i=0; i<5; i++){
            int scnt=0;
            for(int j=0; j<5; j++){
                if(bingGo[j][i]==0) scnt++;
            }
            if(scnt==5) cnt++;
        }
    }
    public static void length(){
        for(int i=0; i<5; i++){
            int scnt=0;
            for(int j=0; j<5; j++){
                if(bingGo[i][j]==0) scnt++;
            }
            if(scnt==5) cnt++;
        }
    }
    public static void Lcrr(){
        int scnt=0;
        for(int i=0; i<5; i++){
            if(bingGo[i][i]==0) scnt++;
            if(scnt==5) cnt++;
        }
    }
    public static void Rcrr(){
        int scnt=0;
        for(int i=0; i<5; i++){
            if(bingGo[i][4-i]==0) scnt++;
            if(scnt==5) cnt++;
        }
    }

}
