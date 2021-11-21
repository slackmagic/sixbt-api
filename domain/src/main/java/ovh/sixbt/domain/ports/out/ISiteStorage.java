package ovh.sixbt.domain.ports.out;

import ovh.sixbt.domain.models.sites.Site;
import java.util.List;

public interface ISiteStorage {
    List<Site> getSites();
}
