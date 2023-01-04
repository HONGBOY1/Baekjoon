package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[]= str.split("");
        int cnt=1;
        int x=10,sv=1;
        int sum=0;
        for(int i=str.length()-1; i>=0; i--){
            if(arr[i].equals("1")) sum+=cnt*sv;
            if(cnt==1) cnt=2;
            else if(cnt==2) cnt=4;
            else {cnt=1; sv*=10;}
        }
        System.out.println(sum);
    }
}
