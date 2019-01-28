package sessions;

import org.junit.Assert;
import org.junit.Test;

public class DroneFlightPlannerTest {

    DroneFlightPlanner droneFlightPlanner = new DroneFlightPlanner();

    @Test
    public void calcDroneMinEnergyReturnsTotalEnergyNeeded() {
        int[][] route = new int[][]{
                {0,  2,  10},
                {3,  5,   0},
                {9,  20,  6},
                {10, 12, 15},
                {10, 10,  8}};
        //Assert.assertEquals(5, droneFlightPlanner.calcDroneMinEnergy(route));
        Assert.assertEquals(5, droneFlightPlanner.calcDroneMinEnergyAlt(route));

        int[][] route2 = new int[][]{
                {0,2,2},
                {3,5,38},
                {9,20,6},
                {10,12,15},
                {10,10,8}};
        Assert.assertEquals(36, droneFlightPlanner.calcDroneMinEnergy(route2));
        /*
        2, 38 => ascending, energyNeeded -36 energy 0
        38, 6 => descending, energyNeeded -4 energy
        6, 15 => ascending, energyNeeded -11
        15, 8 => descending, energyNeeded -4
        */

        int[][] route3 = new int[][]{{0,2,6},{10,10,20}};

        Assert.assertEquals(14, droneFlightPlanner.calcDroneMinEnergy(route3));

    }
}
