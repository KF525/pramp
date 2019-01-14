package daily_problems;

import org.junit.Test;

public class TravelMatrixTest {

    TravelMatrix travelMatrix = new TravelMatrix();

    @Test
    public void minStepsPathReturnsCorrectNumberOfSteps() {
        boolean[][] matrix = new boolean[][]
                {
                {true,  true,  true},
                {true,  false, true},
                {true,  true,  true},
                {false, true,  true}
                };

        Integer steps = travelMatrix.minimumStepsPath(matrix);
    }
}
