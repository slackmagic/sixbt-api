package ovh.sixbt.domain.ports.in;

import ovh.sixbt.domain.models.contacts.Contact;
import ovh.sixbt.domain.models.contacts.EContactCategory;
import java.util.List;

public interface IContactService {
    List<Contact> getPublicContacts();
    List<Contact> getPublicContacts(final EContactCategory category);

    List<Contact> getPrivateContacts();
    List<Contact> getPrivateContacts(final EContactCategory category);
}
