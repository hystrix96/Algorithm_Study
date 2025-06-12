package BOJ_2161_카드1;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            cards.add(i);
        }

        while (cards.size()>1) {
            bw.write(cards.poll() + " ");
            cards.add(cards.poll());
        }

        bw.write(Integer.toString(cards.poll()));

        bw.flush();
        br.close();
        bw.close();
    }
}
