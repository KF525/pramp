package sessions;

public class BusiestTimeInMall {

    public int returnTimestampOfBusiestTime(int[][] data) {
        int busiestTimestamp = data[0][0];
        int busiestNumberOfPeople = Integer.MIN_VALUE;
        int currentNumberOfPeople = 0;

        for (int i=0; i < data.length; i ++) {
            int timestamp = data[i][0];
            int people = data[i][1];
            if (data[i][2] == 0) {
                currentNumberOfPeople -= people;
            } else {
                currentNumberOfPeople += people;
            }

            if (i < data.length - 1 && timestamp == data[i+1][0]) { //if we have a next timestamp to look at and if it's the same keep going
                continue;
            } else {
                if (currentNumberOfPeople > busiestNumberOfPeople) {
                    busiestNumberOfPeople = currentNumberOfPeople;
                    busiestTimestamp = timestamp;
                }
            }
        }

        return busiestTimestamp;
    }
}
