package sessions;

public class ShiftedArraySearch {
    public int shiftedArraySearch(int[] arr, int num) {
        int pivotPoint = findPivotPoint(arr);
        if (pivotPoint == 0 || num < arr[0]) { //go right
            return shiftedSearchHelper(arr, pivotPoint, arr.length-1, num);
        } else { //go left
            return shiftedSearchHelper(arr, 0, pivotPoint - 1, num);
        }
    }

    private int findPivotPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midpoint = (end + start)/2;
            if (midpoint == 0 || arr[midpoint] < arr[midpoint - 1]) {
                return midpoint;
            } else if (arr[midpoint] > arr[0]) {
                start = midpoint + 1;
            } else {
                end = midpoint - 1;
            }
        }
        return 0;
    }

    private int shiftedSearchHelper(int[] arr, int start, int end, int num) {
        while (start <= end) {
            int midpoint = (start + end)/2;
            if (arr[midpoint] == num) return midpoint;
            if (arr[midpoint] < num) { //go right
                return shiftedSearchHelper(arr, midpoint +1, end, num);
            } else { //go left
                return shiftedSearchHelper(arr, start, midpoint -1, num);
            }
        }

        return -1;
    }
}



//            if (arr[midpoint] > arr[midpoint + 1]) {
//                    return midpoint + 1; //gives start of next array
//                    } else if (arr[midpoint] < arr[midpoint - 1]) {
//        return midpoint; //gives start of next array
//        }