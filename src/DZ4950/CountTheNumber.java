package DZ4950;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumber {
    public static void main(String[] args) {

        /**
         * Дана строка "java is fun and java is powerful",
         * подсчитать количество вхождений каждого символа (пробелы не считать!)
         * с помощью HashMap и вывести в консоль результат.
         */


        String text = "java is fun and java powerful";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            }
        }

        charCount.forEach((k, v) -> System.out.println(k + ": " + v));

    }


    /**
     * Доп., не обязательно:
     * Написать метод, проверяющий, есть ли в строке уникальные буквы (которые встречаются только один раз), возвращающий true или false.
     * Написать метод, подсчитывающий среднее количество символов (возвращает double).
     */

    public static boolean UniqueCharacters(String text) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        for (int count : charCount.values()) {
            if (count == 1) {
                return true;
            }
        }
        return false;

    }

}
