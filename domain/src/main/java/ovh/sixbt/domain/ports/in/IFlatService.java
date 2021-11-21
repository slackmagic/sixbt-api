package ovh.sixbt.domain.ports.in;

import ovh.sixbt.domain.models.Flat;

import java.util.List;

public interface IFlatService {
    List<Flat> getFlats();
}
