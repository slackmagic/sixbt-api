package ovh.sixbt.domain.ports.in;

import ovh.sixbt.domain.models.building.Flat;

import java.util.List;

public interface IBuildingService {
    List<Flat> getFlats();
}
