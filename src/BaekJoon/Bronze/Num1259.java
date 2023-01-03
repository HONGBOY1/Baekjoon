package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            String temp = "";
            if(str.equals("0")) break;
            for(int i=str.length()-1; i>=0; i--) temp+=str.charAt(i);
            if(str.equals(temp)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
