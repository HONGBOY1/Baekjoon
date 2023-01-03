package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        for(int i=0; i<n; i++){
            String str = sc.next();
            boolean ch [] = new boolean[26];
            boolean temp=true;
            for(int j=0;j<str.length(); j++){
                int num=str.charAt(j)-'a';
                if(ch[num]){
                    if(str.charAt(j)!=str.charAt(j-1)){
                        temp=false;
                        break;
                    }
                } else{
                    ch[num]=true;
                }
            }
            if(temp) cnt++;
        }
        System.out.println(cnt);
    }
}
