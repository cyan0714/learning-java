package com.shiyan.landlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    public static List<Card> allCards = new ArrayList<>();

    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♦", "♣", "♥", "♠"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size, color, index);
                allCards.add(c);
            }
        }
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "👻", ++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌：" + allCards);
    }

    public static void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o1.getIndex() - o2.getIndex());
    }

    public static void main(String[] args) {
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                player1.add(c);
            } else if (i % 3 == 1) {
                player2.add(c);
            } else if (i % 3 == 2) {
                player3.add(c);
            }
        }

        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());

        sortCards(player1);
        sortCards(player2);
        sortCards(player3);

        System.out.println("玩家1的牌:" + player1);
        System.out.println("玩家2的牌:" + player2);
        System.out.println("玩家3的牌:" + player3);
        System.out.println("待抢的3张牌" + lastThreeCards);
    }
}
