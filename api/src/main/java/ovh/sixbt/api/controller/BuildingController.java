package ovh.sixbt.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.models.building.NetworkInformation;
import ovh.sixbt.domain.ports.in.IBuildingService;

import java.util.List;

@Tag(description = "All about the building.", name = "Building")
@RestController
public class BuildingController {
    private final IBuildingService buildingService;

    @Autowired
    public BuildingController(IBuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @Operation(description = "Get the flat list.")
    @GetMapping("${api-context-path}/building/flats")
    @ResponseBody
    public ResponseEntity<List<Flat>> getFlats() {
        List<Flat> flats = buildingService.getFlats();
        return ResponseEntity.ok(flats);
    }

    @Operation(description = "Get the building network information.")
    @GetMapping("${api-context-path}/building/network")
    @ResponseBody
    public ResponseEntity<NetworkInformation> getNetworkInformation() {
        return ResponseEntity.ok(buildingService.getNetworkInformation());
    }
}
