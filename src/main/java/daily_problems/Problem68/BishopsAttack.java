package daily_problems.Problem68;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BishopsAttack {
/*
On our special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.

You are given N bishops, represented as (row, column) tuples on a M by M chessboard. Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).

For example, given M = 5 and the list of bishops:

(0, 0)
(1, 2)
(2, 2)
(4, 0)
The board would look like this:

[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.
 */
    public int numberOfAttackingBishops(List<Bishop> bishops) {
        int attackingBishops = 0;
        int currentBishop = 0;
        int nextBishop = 1;

        while (currentBishop < bishops.size() && nextBishop < bishops.size()) {
            int maybeAttacking = bishopAttacking(bishops.get(currentBishop), bishops.get(nextBishop));
            attackingBishops += maybeAttacking;
            if (nextBishop < bishops.size() - 1) {
                nextBishop++;
            } else {
                currentBishop = currentBishop + 1;
                nextBishop = currentBishop + 1;
            }
        }

        return attackingBishops;
    }

    private int bishopAttacking(Bishop b1, Bishop b2) {
        if (b1.x + b2.x == Math.abs(b1.y - b2.y)) {
            return 1;
        } else if (Math.abs(b1.x - b1.y) + b2.y == b1.y) { //understand this better
            return 1;
        } else {
            return 0;
        }
    }

    static class Bishop {
        int x;
        int y;

        public Bishop(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
