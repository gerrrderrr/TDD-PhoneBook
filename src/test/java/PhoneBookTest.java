import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void addTest() {
        PhoneBook book = new PhoneBook();
        final int amountExpected = 1;
        String name = "TEST NAME";
        String phoneNumber = "TEST PHONE NUMBER";
        assert book.add(name, phoneNumber) == amountExpected : " оличество номеров в телефонной книге не соответствует за€вленному";
    }
}
