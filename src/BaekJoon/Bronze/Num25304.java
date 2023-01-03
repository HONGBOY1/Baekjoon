package BaekJoon.Bronze;

import java.io.*;
import java.util.Scanner;

public class Num25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner( System.in);
        int dab = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if(sum==dab)  bw.write("Yes");
        else  bw.write("No");

        bw.close();
    }
}
