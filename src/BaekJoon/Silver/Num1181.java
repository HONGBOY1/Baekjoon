package BaekJoon.Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Num1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }

        /** 길이 순서정렬
         * 
         * 
         * */
        String temp;
        String [] save = new String[n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(str[i].length() > str[j].length()){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }

        /**
         *  길이가 같으면 작은순서대로 정렬 
         * 
         * 
         * */
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }else {
                    return s1.length() - s2.length();
                }

            }
        });

        System.out.println(str[0]);
        /** 같은 문자는 제외
         * 
         * */
        for(int i=1; i<n; i++){
            if (!str[i].equals(str[i - 1])) {
                System.out.println(str[i]);
            }
        }
    }
}
