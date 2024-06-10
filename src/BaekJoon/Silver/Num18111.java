package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y =Integer.parseInt(st.nextToken());
        int inv =Integer.parseInt(st.nextToken());
        int box[][] = new int[x][y];
        int min = 256;
        int max = 0;
        for(int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if(min > box[i][j]) min = box[i][j];
                if(max < box[i][j]) max = box[i][j];
            }
        }
        int time = 99999999;
        int high = 0;
        for(int i=min; i<max; i++) {
            int count = 0;
            int block = inv;
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {

                    if(i < box[j][k]) {
                        count += ((box[j][k] - i) * 2);
                        block += (box[j][k] - i);
                    }else {
                        count += (i - box[j][k]);
                        block -= (i - box[j][k]);
                    }
                }
            }
            if(block < 0) break;

            if(time >= count) {
                time = count;
                high = i;
            }
        }
        System.out.println(time +" "+high);

    }
}
