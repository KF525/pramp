package daily_problems.Problem51;

import java.util.Random;

public class DeckShuffle {
/*
Given a function that generates perfectly random numbers between 1 and k (inclusive), where k is an input, write a function that shuffles a deck of cards represented as an array using only swaps.

It should run in O(N) time.

Hint: Make sure each one of the 52! permutations of the deck is equally likely.
 */
    public void shuffle(int[] deck) {
        for (int i=0; i < deck.length; i++) {
            int r = randomizer(deck.length);
            swap(deck, i, r);
        }
    }

    public void swap(int[] deck, int i, int r) {
        int temp = deck[i];
        deck[i] = deck[r];
        deck[r] = temp;
    }

    public int randomizer(int k) {
        Random r = new Random();
        return r.nextInt(k);
    }
}
