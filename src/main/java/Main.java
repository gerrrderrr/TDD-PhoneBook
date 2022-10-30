public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Emily", "7777");
        book.add("Ashley", "4444");
        book.add("Anna", "2222");
        book.add("Ally", "2222");
        System.out.println(book.findByNumber("7777"));
    }
}
