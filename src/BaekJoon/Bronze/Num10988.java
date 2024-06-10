package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String back="";
        String arr[] = str.split("");

        for(int i=str.length()-1;i>=0;i--){
            back+=arr[i];
        }

        if(str.equals(back)){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}
