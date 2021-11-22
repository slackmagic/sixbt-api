package ovh.sixbt.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.models.building.Flat;
import ovh.sixbt.domain.ports.in.IBuildingService;
import java.util.List;

@Api(description = "Get the building information.", tags = "Building")
@RestController
public class BuildingController {
    private final IBuildingService buildingService;

    @Autowired
    public BuildingController(IBuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @ApiOperation(value = "Get the flat list.")
    @GetMapping("${api-context-path}/flats")
    @ResponseBody
    public ResponseEntity<List<Flat>> getFlats() {
        List<Flat> flats = buildingService.getFlats();
        return ResponseEntity.ok(flats);
    }
}
