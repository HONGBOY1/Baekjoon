package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2884 {
    public static void main(String[] args) {
        int h,n,s;
        int t=45;
        Scanner sc = new Scanner(System.in);

        h=sc.nextInt();
        n=sc.nextInt();

        s=n;
        s=n-t;

        if(s < 0){
            t=t-n-1;
            s=59;
            n=(s-t);

            h--;
            if(h < 0){
                h=23;
            }
        }
        else{
            n=s;
        }
        System.out.println(h +" "+ n);
    }
}
