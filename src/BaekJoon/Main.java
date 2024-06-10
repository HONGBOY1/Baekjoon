package BaekJoon;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String dab="";
        switch (str){
            case "NLCS" : dab="North London Collegiate School";
                break;
            case "BHA" : dab="Branksome Hall Asia";
                break;
            case "KIS" : dab="Korea International School";
                break;
            case "SJA" : dab="St. Johnsbury Academy";
                break;
        }
        System.out.println(dab);
    }
}