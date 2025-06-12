package BOJ_2164_카드2;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            cards.add(i);
        }

        while (cards.size() > 1) {
            cards.poll()
        }



        System.out.println(cards.peek());

    }
}
