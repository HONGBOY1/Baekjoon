package BaekJoon.Bronze;

import java.util.Scanner;

public class Num25372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            if(str.length() > 5 && str.length()<10){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
