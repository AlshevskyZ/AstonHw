import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] months = {"Январь", "Феварль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь","Ноябрь","Декабрь","Январь","Феварль", "Март", "Апрель", "Май",
                "Июнь", "Июль", "Август", "Сентябрь"};
        Set<String> uniqueWords = new HashSet<>(List.of(months));
        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.print(word + "\n");
        }
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : months) {
            int count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }
        System.out.println("\nЧастота встречаемости слов:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        ////////////////////////////////////////////// Задание2
        class PhoneBook {
            private Map<String, List<Integer>> contacts;
            public PhoneBook() {
                contacts = new HashMap<>();
            }
            public void add(String surname, int phoneNumber) {
                if (contacts.containsKey(surname)) {
                    contacts.get(surname).add(phoneNumber);
                } else {
                    List<Integer> numbers = new ArrayList<>();
                    numbers.add(phoneNumber);
                    contacts.put(surname, numbers);
                }
            }
            public List<Integer> get(String surname) {
                return contacts.get(surname);
            }
        }
    }
}