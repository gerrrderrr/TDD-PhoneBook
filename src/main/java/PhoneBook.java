import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    public int add(String name, String phoneNumber) {
        if (phoneBook.containsValue(phoneNumber)) {
            System.out.println("Контакт с номером " + phoneNumber + " существует");
        } else {
            phoneBook.put(name, phoneNumber);
            System.out.println("Контакт " + name + " : " + phoneBook.get(name) + " добавлен");
            return phoneBook.size();
        }
        return 0;
    }

    public String findByNumber(String phoneNumber) {
        if (!phoneBook.containsValue(phoneNumber)) {
            return "Данного номера не существует";
        } else {
            return Objects.requireNonNull(phoneBook.entrySet()
                            .stream()
                            .filter(entry -> entry.getValue().equals(phoneNumber))
                            .findFirst()
                            .orElse(null))
                    .getKey();
        }
    }
}
