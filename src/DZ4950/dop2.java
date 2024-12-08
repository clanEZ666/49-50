package DZ4950;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class dop2 {
    public static void main(String[] args) {

        String text = "!!! Java is Fun and java IS powerful !!!";

        String cleanedText = text.replaceAll("[^a-zA-Z ]","").toLowerCase();


        String[] letter = cleanedText.split("\\s+");

        Map<String, Integer> letterCount = new TreeMap<>();

        for (String l : letter) {
            letterCount.put(l, letterCount.getOrDefault(l, 0) + 1);
        }

        letterCount.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
