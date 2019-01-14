package daily_problems;

public class ArrayInversions {
    /*
    determine how out of order an array is by counting number of inversions it has
    2,4,1,3,5 => 3 inversions (2,1), (4,1), 4,3)

    2,4,1,3,5 versus 1,2,3,4,5
    go through 2,4 - not a problem
    get to 1 is less than 4 so move it to the left
    then compare 1 is less than 2 so move it again to the left
    (inversion count is now two)
    then compare 3 is less than 4 so move it to the left
    inversion count is now 3
    2 is less than 3 so no further moves left
    5 is greater than 4 so no more moves necessary
    5,4,3,2,1 => 4,5,3,2,1 => 4,3,5,2,1 => 3,4,5,2,1
    */

    public int countInversions(int[] array) {
        int inversionCount = 0;
        int index = 1;

        while (index < array.length) {
            if (array[index] > array[index - 1]) {
                index = index + 1;
            } else {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                inversionCount = inversionCount + 1;
                if (index != 1) {
                    index = index - 1;
                }
            }
        }
        return inversionCount;
    }
}
