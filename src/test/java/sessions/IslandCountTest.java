package sessions;

import junit.framework.Assert;
import org.junit.Test;

public class IslandCountTest {

    IslandCount islandCount = new IslandCount();

    @Test
    public void getNumberOfIslandsCountsUniqueIslands() {
        int[][] binaryMatrix = {{0,    1,    0,    1,    0},
                {0,    0,    1,    1,    1},
                {1,    0,    0,    1,    0},
                {0,    1,    1,    0,    0},
                {1,    0,    1,    0,    1}};

        Assert.assertEquals(6, islandCount.getNumberOfIslands(binaryMatrix));
    }
}
