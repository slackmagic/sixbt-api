package ovh.sixbt.business;

import ovh.sixbt.business.core.Contact;
import ovh.sixbt.business.core.EContactCategory;

import java.util.List;

public interface IContactService {
    List<Contact> getPublicContacts();
    List<Contact> getPublicContacts(final EContactCategory category);

    List<Contact> getPrivateContacts();
    List<Contact> getPrivateContacts(final EContactCategory category);
}
