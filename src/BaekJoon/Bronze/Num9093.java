package BaekJoon.Bronze;

import java.util.Scanner;

public class Num9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] ArrayStrings = str.split(" ");
            for(int j=0; j <ArrayStrings.length; j++){
                System.out.print(new StringBuffer(ArrayStrings[j]).reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
