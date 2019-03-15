package sessions;

import java.util.HashMap;
import java.util.Map;

public class FlattenDictionary {
    Map<String, String> flattenDictionary(Map<String, Object> dict) {
        Map<String, String> flatMap = new HashMap();
        return flattenDictionaryHelper(dict, flatMap, "");
    }

    Map<String, String> flattenDictionaryHelper(Map<String, Object> dict, Map<String, String> flatMap, String initialKey) {
        for (String k : dict.keySet()) {
            Object value = dict.get(k);

            if (value instanceof HashMap) {
                if (initialKey == null || initialKey.equals("")) {
                    flattenDictionaryHelper((Map<String, Object>) value, flatMap, k);
                } else {
                    flattenDictionaryHelper((Map<String, Object>) value, flatMap, initialKey + "." + k);
                }
            } else {
                if (initialKey == null || initialKey.equals("")) {
                    flatMap.put(k, (String) value);
                } else if (k == null || k.equals("")) {
                    flatMap.put(initialKey, (String) value);
                } else {
                    flatMap.put(initialKey + "." + k, (String) value);
                }
            }
        }

        return flatMap;
    }
}
