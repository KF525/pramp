package daily_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ClassroomCountTest {

    ClassroomCount classroomCount = new ClassroomCount();

    @Test
    public void returnClassroomCountShouldReturnNumberOfClassroomsNeededToAccomodateSchedule() {
        List<List<Integer>> schedules = Arrays.asList(Arrays.asList(0, 50), Arrays.asList(30, 75), Arrays.asList(60, 150));

        Assert.assertEquals(2, classroomCount.returnClassroomCount(schedules));
    }

    @Test
    public void returnClassroomCount() {
        List<List<Integer>> schedules =
                Arrays.asList(
                Arrays.asList(0, 50),
                Arrays.asList(30, 59),
                Arrays.asList(53, 65),
                Arrays.asList(60, 150),
                Arrays.asList(52, 100),
                Arrays.asList(151,200));

        Assert.assertEquals(3, classroomCount.returnClassroomCount(schedules));
    }

    @Test
    public void returnClassroomCount2ReturnsCorrectNumberOfRoomsNeeded() {
        int[][] input1 = new int[][]{{60,150}, {0,50}, {151,200}, {30,59}, {53, 65}, {52, 100}};
        int[][] input2 = new int[][]{{1,10}, {2,11}, {3,15},{5,12}, {9,20}};
        int[][] input3 = new int[][]{{1,10}, {2,11}, {3,15},{5,12}, {10,20}};

        Assert.assertEquals(3, classroomCount.returnClassroomCount2(input1));
        Assert.assertEquals(5, classroomCount.returnClassroomCount2(input2));
        Assert.assertEquals(4, classroomCount.returnClassroomCount2(input3));
    }
}
