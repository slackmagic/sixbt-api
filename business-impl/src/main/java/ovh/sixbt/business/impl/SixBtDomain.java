package ovh.sixbt.business.impl;

import ovh.sixbt.business.ISixBtDomain;
import ovh.sixbt.business.core.Contact;
import ovh.sixbt.systems.IContactStorage;

import java.util.Collections;
import java.util.List;


public class SixBtDomain implements ISixBtDomain {
    private final IContactStorage contactStorage;

    public SixBtDomain(IContactStorage contactStorage) {
       this.contactStorage = contactStorage;
    }

    @Override
    public List<Contact> getPublicContacts() {
        return contactStorage.getPublicContacts();
    }

    @Override
    public List<Contact> getPrivateContacts() {
        return null;
    }

    @Override
    public void login(final String user, final String password) {
    }
}
