package BaekJoon.Bronze;

import java.util.Scanner;

public class Num12605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String text = sc.nextLine();
            String arr[] = text.split(" ");
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
