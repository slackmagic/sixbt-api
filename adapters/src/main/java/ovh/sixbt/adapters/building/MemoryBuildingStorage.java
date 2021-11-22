package ovh.sixbt.adapters.building;

import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.ports.out.IBuildingStorage;

import java.util.ArrayList;
import java.util.List;

public class MemoryBuildingStorage implements IBuildingStorage {

    private final List<Flat> flats;

    public MemoryBuildingStorage(){
        Flat flat1 = Flat.builder().id("1").name("Flat #1").area(20).rent(220).build();
        Flat flat2 = Flat.builder().id("2").name("Flat #2").area(21).rent(230).build();
        Flat flat3 = Flat.builder().id("3").name("Flat #3").area(19).rent(230).build();
        Flat flat4 = Flat.builder().id("4").name("Flat #4").area(20).rent(230).build();

        flats = new ArrayList<>();
        flats.add(flat1);
        flats.add(flat2);
        flats.add(flat3);
        flats.add(flat4);
    }

    @Override
    public List<Flat> getFlats() {
        return flats;
    }
}
