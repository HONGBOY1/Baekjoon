package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        HashSet<Integer> map;
        while(true) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m =  Integer.parseInt(st.nextToken());
            if(n==0 && m==0) break;
            map = new HashSet<>();
            cnt=0;
            for (int i = 0; i < n; i++) {
                map.add(Integer.parseInt(br.readLine()));
            }
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(br.readLine());
                if (map.contains(num)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
