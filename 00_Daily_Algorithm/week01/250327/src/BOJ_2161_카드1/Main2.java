package BOJ_2161_카드1;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            cards.add(i);
        }

        while (cards.size()>1) {
            sb.append(cards.poll()).append(" ");
            cards.add(cards.poll());
        }

        sb.append(cards.poll());

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}

