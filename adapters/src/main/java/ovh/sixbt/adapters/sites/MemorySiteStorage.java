package ovh.sixbt.adapters.sites;

import ovh.sixbt.domain.models.sites.Site;
import ovh.sixbt.domain.ports.out.ISiteStorage;

import java.util.ArrayList;
import java.util.List;

public class MemorySiteStorage implements ISiteStorage {
    private final List<Site> sites;

    public MemorySiteStorage() {
        Site site_1 = Site.builder().name("Gare SNCF").url("https://www.sncf.com/fr/itineraire-reservation/boutiques-bornes/arras").build();
        sites = new ArrayList<>();
        sites.add(site_1);
    }

    @Override
    public List<Site> getSites() {
        return sites;
    }
}
