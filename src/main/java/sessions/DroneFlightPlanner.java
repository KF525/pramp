package sessions;

public class DroneFlightPlanner {
    /*
    You know that the drone burns 1 kWh (kilowatt-hour is an energy unit) for every mile it ascends,
    and it gains 1 kWh for every mile it descends.
    Flying sideways neither burns nor adds any energy.
    Given an array route of 3D points, implement a function calcDroneMinEnergy that computes and returns the minimal amount of energy the drone would need to complete its route.
    Assume that the drone starts its flight at the first point in route.
    That is, no energy was expended to place the drone at the starting point.

    For simplicity, every 3D point will be represented as an integer array whose length is 3.
    Also, the values at indexes 0, 1, and 2 represent the x, y and z coordinates in a 3D point, respectively.

    input:  route = [ [0,   2, 10],
                  [3,   5,  0],
                  [9,  20,  6],
                  [10, 12, 15],
                  [10, 10,  8] ]

    output: 5 # less than 5 kWh and the drone would crash before the finish
          # line. More than `5` kWh and it’d end up with excess energy

    This solution is based on one observation: the initial energy level is what it takes the drone to climb from the start point to the highest (max) point in its route.

    Getting to any altitude below the starting altitude produces energy, and going above it consumes at most the difference between the max altitude and the starting altitude.

    Even if we descend before climbing to the max altitude, by ascending back to the same altitude as the starting altitude, our balance is zero and we then need more energy to climb from the starting altitude to the max altitude.
     */

    int calcDroneMinEnergy(int[][] route) {
        int maxHeight = route[0][2];

        for (int i=1; i <= route.length - 1; i++) {
            if (route[i][2] > maxHeight) {
                maxHeight = route[i][2];
            }
        }

        return maxHeight - route[0][2];
    }

    int calcDroneMinEnergyAlt(int[][] route) {
        int energyDroneHas = 0;
        int energyNeeded = 0;

        for (int i = 1; i < route.length; i++) {
            int coord1 = route[i-1][2];
            int coord2 = route[i][2];
            int difference = Math.abs(coord1 - coord2);
            if (coord1 < coord2) {
                energyDroneHas = energyDroneHas - difference;
                if (energyDroneHas < 0) {
                    energyNeeded += Math.abs(energyDroneHas);
                    energyDroneHas = 0;
                }
            } else {
                energyDroneHas = energyDroneHas + difference;
            }
        }
        return energyNeeded;
    }
}


/*
10, 0, 6, 15, 8
  +10 -6 -9 +7
  any time our current sum is negative we need to add to total we need
 */