package BaekJoon.Silver;

import java.util.Scanner;

public class Num1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt=0;
        int num[] = new int[10];

        for(int i=0; i<str.length(); i++) {
            if( str.charAt(i)=='6' && num[6] > num[9]) num[9]+=1;
            else if(str.charAt(i)=='9' &&  num[9] > num[6])  num[6]+=1;
            else num[Integer.parseInt(String.valueOf(str.charAt(i)))]+=1;
        }

        for(int i=0; i<=9; i++) {
            if(cnt < num[i]) cnt=num[i];
        }
        System.out.println(cnt);

    }
}
