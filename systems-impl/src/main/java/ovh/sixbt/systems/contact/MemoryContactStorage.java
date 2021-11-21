package ovh.sixbt.systems.contact;

import ovh.sixbt.domain.models.Contact;
import ovh.sixbt.domain.models.EContactCategory;
import ovh.sixbt.domain.models.EContactScope;
import ovh.sixbt.domain.ports.out.IContactStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryContactStorage implements IContactStorage {
    private final List<Contact> contacts;

    public MemoryContactStorage() {

        Contact privateContact = Contact.builder().firstName("PRIVATE").lastName("Contact").phone("0123456").category(EContactCategory.PRI).scope(EContactScope.PRIVATE).build();
        Contact publicContact = Contact.builder().firstName("PUBLIC").lastName("Contact").phone("0123456").category(EContactCategory.PRO).scope(EContactScope.PUBLIC).build();

        contacts = new ArrayList<>();
        contacts.add(privateContact);
        contacts.add(publicContact);
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public List<Contact> getContacts(EContactScope scope) {
        return contacts.stream()
                .filter(contact -> contact.getScope().equals(scope))
                .collect(Collectors.toList());
    }
}
