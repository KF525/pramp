package sessions;

public class SentenceReverse {
    //['i', ' ', 'a','m', ' ', 'c','a','t']
    // => ['t','a','c',' ', 'm','a',' ','i']
    public char[] reverse(char[] arr) {
        mirrorReverse(arr, 0, arr.length - 1);

        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (j == arr.length-1) {
                mirrorReverse(arr, i, j);
                j++;
                i=j;
            } else if (arr[j] == ' ') {
                mirrorReverse(arr, i, j-1);
                j++;
                i=j;
            } else {
                j++;
            }
        }

        return arr;
    }

    private void mirrorReverse(char[] arr, int start, int end) {
       while (start < end) {
           char tmp = arr[start];
           arr[start] = arr[end];
           arr[end] = tmp;
           start++;
           end--;
       }
    }


    public char[] reverseAlt(char[] arr) {
        char[] result = new char[arr.length];
        int i=arr.length - 1;
        int k=arr.length - 1;
        int j=0;

        while (i > 0) {
            if (arr[i] == ' ') {
                for (int a=i+1; a <= k; a++) {
                    result[j] = arr[a];
                    j++;
                }
                result[j] = ' ';
                j++;
                i--;
                k=i;
            } else {
                i--;
            }
        }

        for (int a=i; a <= k; a++) {
            result[j] = arr[a];
            j++;
        }

        return result;
    }
}
