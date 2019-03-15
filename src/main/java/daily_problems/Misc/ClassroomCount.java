package daily_problems.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomCount {

    public int returnClassroomCount(int[][] schedules) {
        Arrays.sort(schedules, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(schedules, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> classrooms = new ArrayList<>();
        List<Integer> schedule = new ArrayList<>();
        schedule.add(schedules[0][0]);
        schedule.add(schedules[0][1]);
        classrooms.add(schedule);

        for (int i = 1; i < schedules.length; i++) {
            int index = findClassroom(schedules[i][0], classrooms);
            if (index != -1) {
                int end = schedules[i][1];
                List<Integer> classroom = classrooms.get(index);
                classroom.set(1, end);
            } else {
                List<Integer> scheduleI = new ArrayList<>();
                schedule.add(schedules[i][0]);
                schedule.add(schedules[i][1]);
                classrooms.add(scheduleI);
            }
        }

     return classrooms.size();
    }

    public int findClassroom(int end, List<List<Integer>> classrooms) {
        int index = -1;
        int diff = Integer.MAX_VALUE;

        for (int i=0; i < classrooms.size(); i++) {
            int start = classrooms.get(i).get(1);
            if (end > start && end - start < diff) {
                index = i;
                diff = end - start;
            }
        }

        return index;
    }

    public int returnClassroomCount2(int[][] schedules) {
        int[] start = new int[schedules.length];
        int[] end = new int[schedules.length];
        int maxCount = 0;
        int currentCount = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < schedules.length; i++) {
            start[i] = schedules[i][0];
            end[i] = schedules[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        while (startIndex < start.length && endIndex < end.length) {
            if (start[startIndex] < end[endIndex]) {
                currentCount++;
                startIndex++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount--;
                endIndex++;
            }
        }

        return maxCount;
    }
}