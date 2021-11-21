package ovh.sixbt.domain.ports.out;
import ovh.sixbt.domain.models.Flat;

import java.util.List;

public interface IFlatStorage {
    List<Flat> getFlats();
}
