package ovh.sixbt.business.impl;

import ovh.sixbt.business.ISixBtDomain;

import java.util.Collections;
import java.util.List;


public class SixBtDomain implements ISixBtDomain {
    private final String helixPath;

    public SixBtDomain(final String helixPath) {
        this.helixPath = helixPath;
    }

    @Override
    public List<String> getUsefulAddresses() {
        return Collections.emptyList();
    }

    @Override
    public void login(final String user, final String password) {
    }
}
