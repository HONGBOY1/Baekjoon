package BaekJoon.Bronze;

import BaekJoon.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num26489 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while (true) {
            String tmp = br.readLine();
            if (tmp == null) break;
            cnt++;
        }
        System.out.println(cnt);
    }

}