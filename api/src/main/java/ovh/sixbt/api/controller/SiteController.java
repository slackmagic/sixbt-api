package ovh.sixbt.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.models.sites.Site;
import ovh.sixbt.domain.ports.in.ISiteService;

import java.util.List;

@Tag(description = "Useful interest points around the building.", name = "Sites")
@RestController
public class SiteController {
    private final ISiteService siteService;

    @Autowired
    public SiteController(ISiteService siteService) {
        this.siteService = siteService;
    }

    @Operation(description = "Get the site list.")
    @GetMapping("${api-context-path}/sites")
    @ResponseBody
    public ResponseEntity<List<Site>> getSites() {
        List<Site> sites = siteService.getSites();
        return ResponseEntity.ok(sites);
    }
}
