package daily_problems;

import java.util.ArrayList;
import java.util.List;

public class StringToMultipleTexts {

    public List<String> generateStrings(String str, int k) {

        List<String> result = new ArrayList<>();
        int currentIndex = 0;
        int limitIndex = k-1;

        if (str.isEmpty()) return null;

        while (true) {
            if (limitIndex == currentIndex) return null;

            if (limitIndex == str.length() -1 && limitIndex - currentIndex <= k) {
                result.add(str.substring(currentIndex, limitIndex + 1));
                break;
            } else if (limitIndex == str.length() -1) {
                return null;
            } else if (str.charAt(limitIndex) == ' ' || str.charAt(limitIndex + 1) == ' ') {
                result.add(str.substring(currentIndex, limitIndex + 1));
                currentIndex = limitIndex + 1;
                if (currentIndex + k - 1 < str.length()) {
                    limitIndex = currentIndex + k - 1 ;
                } else {
                    limitIndex = str.length() - 1;
                }
            } else {
                limitIndex = limitIndex - 1;
            }
        }

        return result;
    }
}
