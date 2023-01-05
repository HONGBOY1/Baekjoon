package BaekJoon.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strarr[] = str.split("");

        int arr[] = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i]=Integer.parseInt(strarr[i]);
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }
}
