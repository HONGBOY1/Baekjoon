package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0; i<n;i++){
            int cnt=1;
            int setCnt=1;
            int h= sc.nextInt();
            int w=sc.nextInt();
            int m= sc.nextInt();
            for(int j=m; j>1; j--){
                cnt++;
                if(cnt > h){
                    cnt=1;
                    setCnt++;
                }
            }
            System.out.println(cnt+(setCnt < 10 ? "0" :"")+setCnt);
        }

    }
}
