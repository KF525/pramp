package daily_problems.Problem51;

import daily_problems.Problem51.DeckShuffle;
import org.junit.Test;

public class DeckShuffleTest {

    DeckShuffle deckShuffle = new DeckShuffle();

    @Test
    public void shuffleReturnsUnorderedDeck() {
        int[] deck = new int[]{1,2,3,4,5,6,7,8,9,10};

        deckShuffle.shuffle(deck);

        for (int i=0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }


    }
}
