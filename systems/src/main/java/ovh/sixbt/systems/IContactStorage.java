package ovh.sixbt.systems;

import ovh.sixbt.business.core.Contact;

import java.util.List;

public interface IContactStorage {
    List<Contact> getPublicContacts();
    List<Contact> getPrivateContacts();
}
