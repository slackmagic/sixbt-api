package ovh.sixbt.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.models.Flat;
import ovh.sixbt.domain.ports.in.IFlatService;
import java.util.List;

@Api(description = "Get the flat information.", tags = "Flats")
@RestController
public class FlatController {
    private final IFlatService flatService;

    @Autowired
    public FlatController(IFlatService flatService) {
        this.flatService = flatService;
    }

    @ApiOperation(value = "Get the flat list.")
    @GetMapping("${api-context-path}/flats")
    @ResponseBody
    public ResponseEntity<List<Flat>> getFlats() {
        List<Flat> flats = flatService.getFlats();
        return ResponseEntity.ok(flats);
    }
}
