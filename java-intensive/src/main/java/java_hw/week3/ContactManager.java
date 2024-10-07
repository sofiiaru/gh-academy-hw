package java_hw.week3;

import java.util.*;

public class ContactManager implements Comparator<Contact>{
    private List<Contact> contacts;
    private Map<String, String> phoneNumberLookup;
    private Set<String> emailDomains;
    private Map<String, Contact> contactLookupByEmail;

    public ContactManager() {
        contacts = new ArrayList<>();
        phoneNumberLookup = new HashMap<>();
        emailDomains = new HashSet<>();
        contactLookupByEmail = new HashMap<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        phoneNumberLookup.put(contact.getName(), contact.getPhoneNumber());
        String emailDomain = contact.getEmail().substring(contact.getEmail().indexOf("@")+1);
        emailDomains.add(emailDomain);
        contactLookupByEmail.put(contact.getEmail(), contact);
    }

    public void displayAllContacts() {
        contacts.forEach( c -> System.out.println("Name: " + c.getName()+"\nPhone Number: "+ c.getPhoneNumber() +
                "\nEmail: "+ c.getEmail()));
    }
    public void displayAllContactsInAlphabethicalOrder() {
        Collections.sort(contacts, this);
        contacts.forEach( c -> System.out.println("Name: " + c.getName()+"\nPhone Number: "+ c.getPhoneNumber() +
                "\nEmail: "+ c.getEmail()));
    }

    public boolean removeContact(Contact contact) {
        for( Contact c : contacts) {
            if(c.getName().equals(contact.getName()) &&
                    c.getEmail().equals(contact.getEmail()) &&
                    c.getPhoneNumber().equals(contact.getPhoneNumber())) {
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    public String lookupPhoneNumber(String contactName) {
        return phoneNumberLookup.containsKey(contactName)? phoneNumberLookup.get(contactName) : "Contact doesn't exist" ;
    }

    public void updatePhoneNumber(String contactName, String newPhoneNumber) {
        phoneNumberLookup.put(contactName, newPhoneNumber);
    }

    public void displayEmailDomains(){
        emailDomains.forEach( d -> System.out.println(d));
    }

    public String searchByEmail(String email) {
        return contactLookupByEmail.containsKey(email)? contactLookupByEmail.get(email).getName() : "No such contact exists";
    }


}
