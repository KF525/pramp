package daily_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomCount {

    public int returnClassroomCount(List<List<Integer>> schedules) {
        //TODO: sort the array

        List<List<Integer>> classrooms = new ArrayList<>();
        classrooms.add(schedules.get(0));

        for (int i = 1; i < schedules.size(); i++) {
            int index = findClassroom(schedules.get(i).get(0), classrooms);
            if (index != -1) {
                int end = schedules.get(i).get(1);
                List<Integer> classroom = classrooms.get(index);
                classroom.set(1, end);
            } else {
                classrooms.add(schedules.get(i));
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