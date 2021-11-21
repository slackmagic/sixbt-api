package ovh.sixbt.domain.services;

import ovh.sixbt.domain.models.sites.ESiteCategory;
import ovh.sixbt.domain.models.sites.Site;
import ovh.sixbt.domain.ports.in.ISiteService;
import ovh.sixbt.domain.ports.out.ISiteStorage;

import java.util.List;
import java.util.stream.Collectors;

public class SiteService implements ISiteService {
    private final ISiteStorage siteStorage;

    public SiteService(ISiteStorage siteStorage) {
        this.siteStorage = siteStorage;
    }

    @Override
    public List<Site> getSites() {
        return this.siteStorage.getSites();
    }

    @Override
    public List<Site> getSitesByCategory(ESiteCategory category) {
        return this.getSites().stream()
                .filter(s -> s.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
