package ovh.sixbt.domain.ports.out;
import ovh.sixbt.domain.models.building.Flat;

import java.util.List;

public interface IBuildingStorage {
    List<Flat> getFlats();
}
