package sessions;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    /*
    Given two sorted arrays arr1 and arr2 of passport numbers, implement a function findDuplicates that returns an array of all passport numbers that are both in arr1 and arr2. Note that the output array should be sorted in an ascending order.
    Let N and M be the lengths of arr1 and arr2, respectively. Solve for two cases and analyze the time & space complexities of your solutions: M ≈ N - the array lengths are approximately the same M ≫ N - arr2 is much bigger than arr1.
     */

    public int[] findDuplicates(int[] arr1, int[] arr2) {
        List<Integer> duplicates = new ArrayList();

        if (arr1.length == 0 || arr2.length == 0) {
            return formatOuput(duplicates); //handle if either lists are empty
        }

        int arr1Index = 0;
        int arr2Index = 0;
        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                arr1Index++;
            } else if (arr1[arr1Index] > arr2[arr2Index]) {
                arr2Index++;
            } else {
                duplicates.add(arr1[arr1Index]);
                arr1Index++;
                arr2Index++;
            }
        }
        return formatOuput(duplicates);
    }

    public int[] formatOuput(List<Integer> duplicates) {
        int[] finalOutput = new int[duplicates.size()];

        for (int i=0; i < duplicates.size(); i++) {
            finalOutput[i] = duplicates.get(i);
        }

        return finalOutput;
    }
}
