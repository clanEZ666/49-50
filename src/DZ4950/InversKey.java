package DZ4950;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InversKey {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                1, "C",
                2, "B",
                3, "A");

        Map<String, Integer> invertedMap = invertMap(map);
        invertedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static <K, V> Map<V, K> invertMap(Map<K, V> originalMap) {
        Map<V, K> invertedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }
}
