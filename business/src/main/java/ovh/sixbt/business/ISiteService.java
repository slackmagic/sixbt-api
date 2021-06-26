package ovh.sixbt.business;

import ovh.sixbt.business.core.ESiteCategory;
import ovh.sixbt.business.core.Site;

import java.util.List;

public interface ISiteService {
    List<Site> getSites();
    List<Site> getSitesByCategory(final ESiteCategory category);
}
