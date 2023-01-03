package BaekJoon.Bronze;

import java.util.Scanner;

public class Num4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=1;
        while(true){
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();
            if(l==0 && p ==0 && v == 0 ) break;
            int cnt=1;
            for(int i=0; i<=v;i++){
                int sl=l;
                if(l==0){
                    v-=p;
                    l=sl;
                }
                l--;
                cnt++;
            }
            System.out.println("Case "+j++ +": "+cnt);
        }
    }
}
