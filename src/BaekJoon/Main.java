package BaekJoon;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println( (a-(a*22/100))+" "+(a-(a*20/100*22/100)));
    }
}