package daily_problems.Problem81;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PossibleMappingsTest {

    PossibleMappings possibleMappings = new PossibleMappings();

    @Test
    public void findMappingsReturnsListOfAllPossibleMappings() {
        Map<Integer, List<String>> mapping = new HashMap<>();
        List<String> two = new ArrayList<>();
        two.add("a");
        two.add("b");
        two.add("c");
        mapping.put(2, two);
        List<String> three = new ArrayList<>();
        three.add("d");
        three.add("e");
        three.add("f");
        mapping.put(3, three);

        List<String> mappings = possibleMappings.findMappings(mapping, "23");
        Assert.assertEquals(9, mappings.size());
        Assert.assertEquals("ad", mappings.get(0));
        Assert.assertEquals("ae", mappings.get(1));

        //[“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].

    }
}
