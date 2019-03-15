package sessions;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FlattenDictionaryTest {

    FlattenDictionary flattenDictionary = new FlattenDictionary();

    @Test
    public void flattenDictionaryReturnsFlatDictionary() {
        Map<String, Object> map3 = new HashMap<>();
        map3.put("d", "3");
        map3.put("e", "1");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("a", "2");
        map2.put("b", "3");
        map2.put("c", map3);
        Map<String, Object> map1 = new HashMap();
        map1.put("Key1", "1");
        map1.put("Key2", map2);

        Map<String, Object> expectedMap = new HashMap<>();
        expectedMap.put("Key1","1");
        expectedMap.put("Key2.a","2");
        expectedMap.put("Key2.b","3");
        expectedMap.put("Key2.c.d","3");
        expectedMap.put("Key2.c.e","1");

        Assert.assertEquals(expectedMap, flattenDictionary.flattenDictionary(map1));
    }

    @Test
    public void flattenDictionaryHandlesNesting() {
        Map<String, Object> map = new HashMap<>();
        map.put("", "pramp");
        Map<String, Object> map1 = new HashMap<>();
        map1.put("f", map);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("e", map1);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("d", map2);
        Map<String, Object> map4 = new HashMap<>();
        map4.put("c", map3);
        Map<String, Object> map5 = new HashMap<>();
        map5.put("b", map4);
        Map<String, Object> map6 = new HashMap<>();
        map6.put("a", map5);

        Map<String, Object> expectedMap = new HashMap<>();
        expectedMap.put("a.b.c.d.e.f", "pramp");

        Assert.assertEquals(expectedMap, flattenDictionary.flattenDictionary(map6));
    }
}
