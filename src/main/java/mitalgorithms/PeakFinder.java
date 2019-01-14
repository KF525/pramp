package mitalgorithms;

import java.util.List;

public class PeakFinder {

    public int oneDimensionalPeakFinder(List<Integer> numbers) {
        return oneDimensionalPeakFinderHelper(numbers, 0, numbers.size() -1);
    }

    public int oneDimensionalPeakFinderHelper(List<Integer> numbers, int start, int end) {
        int midpoint = (start + end)/2; //find midpoint
        int currentValue = numbers.get(midpoint);

        if (start >= end) {
            return start; //represents an list of 1
        } else if (numbers.get(midpoint - 1) > currentValue) {
            return oneDimensionalPeakFinderHelper(numbers, start, midpoint - 1);
        } else if (numbers.get(midpoint + 1) > currentValue) { //go to the right
            return oneDimensionalPeakFinderHelper(numbers, midpoint + 1, end);
        } else {
            return midpoint;
        }
    }

    public int oneDimensionalPeakFinder(int[] numbers) {
        return oneDimensionalPeakFinderHelper(numbers, 0, numbers.length-1);
    }

    public int oneDimensionalPeakFinderHelper(int[] numbers, int start, int end) {
        int midpoint = (start + end)/2;
        int currentValue = numbers[midpoint];

        if (start >= end) {
            return start;
        } else if (numbers[midpoint - 1] > currentValue) {
            return oneDimensionalPeakFinderHelper(numbers, start, midpoint - 1);
        } else if (numbers[midpoint + 1] > currentValue) {
            return oneDimensionalPeakFinderHelper(numbers, midpoint + 1, end);
        } else {
            return midpoint;
        }
    }
}
