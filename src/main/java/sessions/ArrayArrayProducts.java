package sessions;

public class ArrayArrayProducts {
    int[] arrayOfArrayProducts(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return new int[]{}; //no values to multiply if 0 or 1 item in array

        int[] results = new int[arr.length]; // "cache"
        //When we multiply all values of arr before and after each index, we get our answer — the product of all the integers except arr[i].

        int leftProductBase = 1;
        for (int i = 0; i < arr.length; i++) { //going from left to right
            results[i] = leftProductBase;
            leftProductBase *= arr[i];
        }

        int rightProductBase = 1;
        for (int i = arr.length - 1; i >= 0; i--) { //going from right to left
            results[i] *= rightProductBase;
            rightProductBase *= arr[i];
        }

        return results;
    }
}
