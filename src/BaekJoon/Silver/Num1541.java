package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        String str = br.readLine();
        String[ ] strArr = str.split("-");

        for(String s : strArr){
            int sum = 0;
            String[] strArr2 = s.split("\\+");
            for(String s2 : strArr2){
                sum += Integer.parseInt(s2);
            }
            list.add(sum);
        }
        long answer =list.get(0);

        for (int i = 1; i < list.size(); i++) {
            answer -= list.get(i);
        }
        System.out.println(answer);

    }
}
