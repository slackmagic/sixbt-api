package ovh.sixbt.domain.services;

import ovh.sixbt.domain.models.building.BuildingInformation;
import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.models.building.NetworkInformation;
import ovh.sixbt.domain.ports.in.IBuildingService;
import ovh.sixbt.domain.ports.out.IBuildingStorage;

import java.util.List;

public class BuildingService implements IBuildingService {
    private final IBuildingStorage buildingStorage;

    public BuildingService(IBuildingStorage buildingStorage) {
        this.buildingStorage = buildingStorage;
    }

    @Override
    public List<Flat> getFlats() {
        return buildingStorage.getFlats();
    }

    @Override
    public BuildingInformation getInformation() {
        return null;
    }

    @Override
    public NetworkInformation getNetworkInformation() {
        return buildingStorage.getNetworkInformation();
    }
}
