package java_hw.week3;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("John Doe", "111-222-3456", "jdoe@gmail.com");
        Contact c2 = new Contact("Harry Potter", "123-456-7890", "harry@yahoo.com");
        Contact c3 = new Contact("Ron Weasley", "999-345-2345", "ron@gmail.com");

        ContactManager manager = new ContactManager();
        manager.addContact(c1);
        manager.addContact(c2);
        manager.addContact(c3);

        manager.displayAllContacts();
        System.out.println("*************************");
        manager.displayAllContactsInAlphabethicalOrder();
        System.out.println("*************************");
        System.out.println(manager.lookupPhoneNumber("John Doe"));
        System.out.println("*************************");
        manager.displayEmailDomains();
        System.out.println("*************************");
        System.out.println(manager.searchByEmail("ron@gmail.com"));

    }
}
