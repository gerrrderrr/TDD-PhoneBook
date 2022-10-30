import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook book = new PhoneBook();
        final int amountExpected = 1;
        String name = "TEST NAME";
        String phoneNumber = "TEST PHONE NUMBER";
        assert book.add(name, phoneNumber) == amountExpected : "Количество номеров в телефонной книге не соответствует заявленному";
    }

    @Test
    public void findByNumberTest() {
        PhoneBook book = new PhoneBook();
        String name1 = "TEST NAME 1";
        String phoneNumber1 = "TEST PHONE NUMBER 1";
        String name2 = "TEST NAME 2";
        String phoneNumber2 = "TEST PHONE NUMBER 2";
        String name3 = "TEST NAME 3";
        String phoneNumber3 = "TEST PHONE NUMBER 3";
        book.add(name1, phoneNumber1);
        book.add(name2, phoneNumber2);
        book.add(name3, phoneNumber3);
        assert book.findByNumber(phoneNumber2).equals(name2) : "Искомое имя не совпадает с действительным";
    }

    @Test
    public void findByNameTest() {
        PhoneBook book = new PhoneBook();
        String name1 = "TEST NAME 1";
        String phoneNumber1 = "TEST PHONE NUMBER 1";
        String name2 = "TEST NAME 2";
        String phoneNumber2 = "TEST PHONE NUMBER 2";
        String name3 = "TEST NAME 3";
        String phoneNumber3 = "TEST PHONE NUMBER 3";
        book.add(name1, phoneNumber1);
        book.add(name2, phoneNumber2);
        book.add(name3, phoneNumber3);
        assert book.findByName(name3).equals(phoneNumber3) : "Искомый номер телефона не совпадает с действительным";
    }

    @Test
    public void printAllNamesTest() {
        PhoneBook book = new PhoneBook();
        String name1 = "C";
        String phoneNumber1 = "TEST PHONE NUMBER C";
        String name2 = "A";
        String phoneNumber2 = "TEST PHONE NUMBER A";
        String name3 = "B";
        String phoneNumber3 = "TEST PHONE NUMBER B";
        book.add(name1, phoneNumber1);
        book.add(name2, phoneNumber2);
        book.add(name3, phoneNumber3);
        String expected = "[" + name2 + ", " + name3 + ", " + name1 + "]";
        assert book.printAllNames().equals(expected);
    }
}
