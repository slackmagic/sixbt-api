package ovh.sixbt.domain.ports.out;
import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.models.building.NetworkInformation;

import java.util.List;

public interface IBuildingStorage {
    List<Flat> getFlats();
    NetworkInformation getNetworkInformation();
}
