package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y= sc.nextInt();
        String WB="WBWBWBWB";
        String BW="BWBWBWBW";
        String[] line = new String[x];
        for(int i=0; i<x; i++){
            line[i]=sc.next();
        }

        for(int i=0; i<x; i++){
            System.out.println(line[i]);
        }

    }
}
