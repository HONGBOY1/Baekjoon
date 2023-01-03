package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num9733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bee = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex" };
        int chk[] = new int[7];
        double total = 0;
        String data = "";

        while ((data = br.readLine()) != null){
            String[] arr = data.split(" ");
            total += arr.length;

            for (int i = 0; i < arr.length; i++) {
                String op = arr[i];
                for (int j = 0; j < 7; j++) {
                    if(op.equals(bee[j])){
                        chk[j]++;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < 7 ; i++) {
            System.out.printf("%s %d %.2f\n",bee[i], chk[i], chk[i]/total);
        }
        System.out.printf("%s %d %.2f","Total",(int)total,1.00);
    }
}

