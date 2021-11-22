package ovh.sixbt.domain.ports.in;

import ovh.sixbt.domain.models.building.BuildingInformation;
import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.models.building.NetworkInformation;

import java.util.List;

public interface IBuildingService {
    List<Flat> getFlats();

    BuildingInformation getInformation();
    NetworkInformation getNetworkInformation();
}
