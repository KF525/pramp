package daily_problems;

import java.util.Random;

public class DeckShuffle {

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
