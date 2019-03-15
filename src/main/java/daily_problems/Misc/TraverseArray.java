package daily_problems.Misc;

public class TraverseArray {

  boolean isTraversable(int[] arr) {
    Boolean[] cache = new Boolean[arr.length-1];
    return traverseHelper(arr, 0, cache);
  }

  boolean traverseHelper(int[] arr, int index, Boolean[] cache) {
    if (index == arr.length - 1) return true;
    if (index > arr.length - 1) return false;

    if (cache[index] != null) return cache[index];

    int steps = arr[index];
    for (int i=1; i < steps; i++) {
      cache[index + i] = traverseHelper(arr, index + i, cache);
    }

    if (cache[arr.length-1] == null) return false;
    return cache[arr.length-1];
  }
}


