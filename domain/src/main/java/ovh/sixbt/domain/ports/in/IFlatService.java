package ovh.sixbt.domain.ports.in;

import ovh.sixbt.domain.models.flats.Flat;

import java.util.List;

public interface IFlatService {
    List<Flat> getFlats();
}
