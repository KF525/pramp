package mitalgorithms;

import org.junit.Assert;
import org.junit.Test;

public class RunwayReservationSystemTest {

    RunwayReservationSystem runwayReservationSystem = new RunwayReservationSystem();

    @Test
    public void isScheduledReturnsBooleanIfRuntimeCanBeScheduled() {
        RunwayReservationSystem.RunwayNode right =
                new RunwayReservationSystem.RunwayNode(54, null, null);
        RunwayReservationSystem.RunwayNode left =
                new RunwayReservationSystem.RunwayNode(23, new RunwayReservationSystem.RunwayNode(10), null);
        RunwayReservationSystem.RunwayNode runwayNode =
                new RunwayReservationSystem.RunwayNode(49, left, right);

        Assert.assertTrue(runwayReservationSystem.isScheduled(runwayNode, 46, 3));
        Assert.assertFalse(runwayReservationSystem.isScheduled(runwayNode, 56, 3));
    }
}
