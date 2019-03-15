package daily_problems.Problem35;

import daily_problems.Problem35.RBGSorter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RBGSorterTest {

    RBGSorter rbgSorter = new RBGSorter();

    @Test
    public void sortShouldOrganizeColorsCorrectly() {
        List<Character> colors = new ArrayList<>();
        colors.add('B');
        colors.add('R');
        colors.add('G');
        colors.add('R');
        colors.add('B');
        colors.add('G');
        colors.add('B');

        List<Character> sortedColors = rbgSorter.sort(colors);
        for (int i=0; i < sortedColors.size(); i++) {
            System.out.print(sortedColors.get(i));
        }
    }
}
