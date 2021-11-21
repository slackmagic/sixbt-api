package ovh.sixbt.domain.ports.out;

import ovh.sixbt.domain.models.contacts.Contact;
import ovh.sixbt.domain.models.contacts.EContactScope;

import java.util.List;

public interface IContactStorage {
    List<Contact> getContacts();
    List<Contact> getContacts(EContactScope scope);
}
