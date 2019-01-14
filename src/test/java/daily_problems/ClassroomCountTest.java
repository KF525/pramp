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
//        List<List<Integer>> schedules = Arrays.asList(Arrays.asList(30, 75), Arrays.asList(0, 50), Arrays.asList(60, 150));

        Assert.assertEquals(2, classroomCount.returnClassroomCount(schedules));
    }

    @Test
    public void returnClassroomCount() {
        List<List<Integer>> schedules =
                Arrays.asList(
                Arrays.asList(0, 50),
                Arrays.asList(30, 59),
                Arrays.asList(53, 65),
                Arrays.asList(60, 150));

        Assert.assertEquals(2, classroomCount.returnClassroomCount(schedules));
    }
}
