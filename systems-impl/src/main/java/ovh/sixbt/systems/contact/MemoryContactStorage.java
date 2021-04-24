package ovh.sixbt.systems.contact;

import ovh.sixbt.business.core.Contact;
import ovh.sixbt.systems.IContactStorage;

import java.util.Collections;
import java.util.List;

public class MemoryContactStorage implements IContactStorage {
    private final List<Contact> privateContacts;
    private final List<Contact> publicContacts;

    public MemoryContactStorage() {
        privateContacts = Collections.singletonList(Contact.builder().firstName("PRIVATE").lastName("Contact").phone("0123456").build());
        publicContacts = Collections.singletonList(Contact.builder().firstName("PUBLIC").lastName("Contact").phone("0123456").build());
    }

    @Override
    public List<Contact> getPublicContacts() {
        return publicContacts;
    }

    @Override
    public List<Contact> getPrivateContacts() {
        return privateContacts;
    }
}
