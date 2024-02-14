package weekly3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public static List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContacts(Contact contact){
        contacts.add(contact);
    }

    public void displayContact(){
        for (Contact contact : contacts) {
            if(contacts.isEmpty()){
                System.out.println("연락처가 비어있습니다.");
            }
            contact.showContacts();
        }
    }

    public void searchContact(String name){
        boolean isSearch = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)){
                contact.showContacts();
                isSearch = true;
            }
        }

        if(!isSearch){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }





}
