package ovh.sixbt.adapters.building;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ovh.helix.untold.simplekv.ISimpleKvApi;
import ovh.helix.untold.simplekv.adapters.memory.MemoryKvAPI;
import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.models.building.NetworkInformation;
import ovh.sixbt.domain.ports.out.IBuildingStorage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MemoryBuildingStorage implements IBuildingStorage {
    public static final String NETWORK_INFORMATION = "network_information";
    public static final String FLATS = "flats";

    private final ISimpleKvApi storage;
    private final Gson gson = new Gson();

    public MemoryBuildingStorage() {
        this.storage = new MemoryKvAPI();
        this.populate();
    }

    private void populate() {
        List<Flat> flats = new ArrayList<>();
        flats.add(Flat.builder().id("1").name("Flat #1").area(20).rent(220).build());
        flats.add(Flat.builder().id("2").name("Flat #2").area(21).rent(230).build());
        flats.add(Flat.builder().id("3").name("Flat #3").area(19).rent(230).build());
        flats.add(Flat.builder().id("4").name("Flat #4").area(20).rent(230).build());

        NetworkInformation networkInformation = NetworkInformation.builder()
                .wifiSSID("MY_SSID")
                .wifiPassword("MY_PASSWORD")
                .build();

        storage.CreateOrUpdate(FLATS, gson.toJson(flats));
        storage.CreateOrUpdate(NETWORK_INFORMATION, gson.toJson(networkInformation));
    }

    @Override
    public List<Flat> getFlats() {
        Type flatListType = new TypeToken<ArrayList<Flat>>() {
        }.getType();
        return gson.fromJson(storage.get(FLATS).orElse("[]"), flatListType);
    }

    @Override
    public NetworkInformation getNetworkInformation() {
        return gson.fromJson(storage.get(NETWORK_INFORMATION).orElse(""), NetworkInformation.class);
    }
}
