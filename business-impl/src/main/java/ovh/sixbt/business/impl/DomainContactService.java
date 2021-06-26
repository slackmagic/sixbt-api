package ovh.sixbt.business.impl;

import ovh.sixbt.business.IContactService;
import ovh.sixbt.business.core.Contact;
import ovh.sixbt.business.core.EContactCategory;
import ovh.sixbt.systems.IContactStorage;

import java.util.List;
import java.util.stream.Collectors;

public class DomainContactService implements IContactService {
    private final IContactStorage contactStorage;

    public DomainContactService(IContactStorage contactStorage) {
        this.contactStorage = contactStorage;
    }

    @Override
    public List<Contact> getPublicContacts() {
        return contactStorage.getPublicContacts();
    }

    @Override
    public List<Contact> getPublicContacts(final EContactCategory category) {
        return contactStorage.getPublicContacts()
                .stream()
                .filter(contact -> contact.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Contact> getPrivateContacts() {
        return contactStorage.getPrivateContacts();
    }

    @Override
    public List<Contact> getPrivateContacts(final EContactCategory category) {
        return contactStorage.getPrivateContacts()
                .stream()
                .filter(contact -> contact.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
