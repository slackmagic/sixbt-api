package ovh.sixbt.domain.services;

import ovh.sixbt.domain.models.Flat;
import ovh.sixbt.domain.ports.in.IFlatService;
import ovh.sixbt.domain.ports.out.IFlatStorage;

import java.util.List;

public class FlatService implements IFlatService {
    private final IFlatStorage flatStorage;

    public FlatService(IFlatStorage flatStorage) {
        this.flatStorage = flatStorage;
    }

    @Override
    public List<Flat> getFlats() {
        return flatStorage.getFlats();
    }
}
