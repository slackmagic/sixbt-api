package ovh.sixbt.business;
import ovh.sixbt.business.core.Contact;

import java.util.List;

public interface ISixBtDomain {
    List<Contact> getPublicContacts();
    List<Contact> getPrivateContacts();

    void login(String user, String password);
}