package BaekJoon.Silver;

import java.util.Scanner;

public class Num7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int [n][2];
        int box[] = new int [n];
        for(int i=0; i<n; i++){
            box[i]++;
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    box[i]++;
                }
            }
        }
        for(int i=0; i<n; i++) System.out.print(box[i]+" ");


    }
}
