package ovh.sixbt.domain.ports.in;
import ovh.sixbt.domain.models.ESiteCategory;
import ovh.sixbt.domain.models.Site;

import java.util.List;

public interface ISiteService {
    List<Site> getSites();
    List<Site> getSitesByCategory(final ESiteCategory category);
}
