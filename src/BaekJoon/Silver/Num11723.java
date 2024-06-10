import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int bitset = 0;

        Set<Integer> set = new HashSet<>();

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x;

            switch (str) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) set.remove(x);
                    else set.add(x);
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;

            }
        }
        System.out.println(sb);
    }

}