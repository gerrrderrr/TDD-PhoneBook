public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        System.out.println(book.add("Emily", "7777"));
        System.out.println(book.add("Ashley", "4444"));
        System.out.println(book.add("Anna", "2222"));
        System.out.println(book.add("Ally", "2222"));
        System.out.println(book.findByNumber("7777"));
        System.out.println(book.findByName("Emil"));
        System.out.println(book.printAllNames());
    }
}
