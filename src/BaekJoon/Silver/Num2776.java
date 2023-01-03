package BaekJoon.Silver;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num2776 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t=Integer.parseInt(st.nextToken());
        for(int k=0; k<t; k++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int arr[] = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int cnt[] = new int[m];
            int ck[] = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                ck[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < m; i++) {
                int l = 0, r = n - 1;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (ck[i] == arr[mid]) {
                        cnt[i]++;
                        break;
                    } else if (arr[mid] > ck[i]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
               bw.write(cnt[i]+"\n");
            }
        }
        bw.close();
    }
}
