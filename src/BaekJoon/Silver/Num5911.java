package BaekJoon.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num5911 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long B = sc.nextInt();
        ArrayList<Long> costs = new ArrayList<>();
        ArrayList<Long> couponCosts = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long P = sc.nextInt();
            long S = sc.nextInt();
            costs.add(P + S);
            couponCosts.add((P / 2) + S);
        }
        int cnt =0;
        Collections.sort(costs);
        long budget = B;
        int gifts = 0;
        for (long cost : costs) {
            if (budget >= cost) {
                budget -= cost;
                gifts++;
            } else {
                break;
            }
        }
        cnt = gifts;

        for (int i = 0; i < N; i++) {
            budget = B - couponCosts.get(i);
            if (budget < 0) continue;
            gifts = 1;
            ArrayList<Long> tempCosts = new ArrayList<>(costs);
            tempCosts.remove(costs.get(i));
            Collections.sort(tempCosts);
            for (long cost : tempCosts) {
                if (budget >= cost) {
                    budget -= cost;
                    gifts++;
                } else {
                    break;
                }
            }
            cnt = Math.max(cnt, gifts);
        }

        System.out.println(cnt);
    }
}
