package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        String[] temp = new String[2];
        int sum;
        String num="",save="";
        temp[0]="";
        temp[1]="";
        str[0]=sc.next();
        str[1]=sc.next();
        for(int i=0; i<2; i++){
            for(int j=str[i].length()-1; j>=0; j--) {
                temp[i] += str[i].charAt(j);
            }
        }
        sum=Integer.parseInt(temp[0])+Integer.parseInt(temp[1]);
        save=sum+"";
        for(int i=save.length()-1; i>=0; i--){
            num+=save.charAt(i);
        }
        System.out.println(Integer.parseInt(num));
    }
}
