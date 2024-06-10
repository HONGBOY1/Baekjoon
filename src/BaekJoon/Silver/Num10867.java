package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Num10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> listchk = new ArrayList<Integer>();
        for(int item : list){
            if(!listchk.contains(item))
                listchk.add(item);
        }
        Collections.sort(listchk);
        for (int i = 0; i < listchk.toArray().length; i++) {
            System.out.print(listchk.get(i) + " ");
        }
    }
}
