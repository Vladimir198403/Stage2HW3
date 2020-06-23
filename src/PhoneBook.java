import java.util.Set;

public class PhoneBook {




    public static void main(String[] args) {
        PhoneBook2  phoneBook = new PhoneBook2();
            phoneBook.add("Ivan", "999-88-99");
            phoneBook.add("Vladimir", "555-55-55");
            phoneBook.add("Andrey","222-23-21");
            phoneBook.add("Ivan", "555-98-87");

            Set<String> allNames = phoneBook.getAllName();
        for (String name : allNames) {
            Set<String> phones = phoneBook.get(name);
            System.out.printf("%s: %s%n", name, phones);
        }
    }

}
