package ovh.sixbt.domain.services;

import ovh.sixbt.domain.models.Contact;
import ovh.sixbt.domain.models.EContactCategory;
import ovh.sixbt.domain.models.EContactScope;

import ovh.sixbt.domain.ports.in.IContactService;
import ovh.sixbt.domain.ports.out.IContactStorage;

import java.util.List;
import java.util.stream.Collectors;

public class ContactService implements IContactService {
    private final IContactStorage contactStorage;

    public ContactService(IContactStorage contactStorage) {
        this.contactStorage = contactStorage;
    }

    @Override
    public List<Contact> getPublicContacts() {
        return contactStorage.getContacts(EContactScope.PUBLIC);
    }

    @Override
    public List<Contact> getPublicContacts(final EContactCategory category) {
        return this.getPublicContacts()
                .stream()
                .filter(contact -> contact.getCategory().equals(category))
                .collect(Collectors.toList());
    }
    @Override
    public List<Contact> getPrivateContacts() {
        return contactStorage.getContacts(EContactScope.PRIVATE);
    }

    @Override
    public List<Contact> getPrivateContacts(final EContactCategory category) {
        return this.getPrivateContacts()
                .stream()
                .filter(contact -> contact.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
