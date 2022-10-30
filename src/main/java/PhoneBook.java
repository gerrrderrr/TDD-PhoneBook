import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    public int add(String name, String phoneNumber) {
        if (phoneBook.containsValue(phoneNumber)) {
            System.out.println("Контакт с таким номером существует: " + phoneBook.get(name));
        } else {
            phoneBook.put(name, phoneNumber);
            System.out.println("Контакт " + name + " : " + phoneBook.get(name) + " добавлен");
            return phoneBook.size();
        }
        return 0;
    }
}
