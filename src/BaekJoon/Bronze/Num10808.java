package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];
        String str=sc.next();
        for(int i=0; i<str.length(); i++){
            int c = str.charAt(i) - 97;
            arr[c]++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
