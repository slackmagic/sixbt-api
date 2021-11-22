package ovh.sixbt.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.models.sites.Site;
import ovh.sixbt.domain.ports.in.ISiteService;

import java.util.List;

@Api(description = "Get the site information.", tags = "Sites")
@RestController
public class SiteController {
    private final ISiteService siteService;

    @Autowired
    public SiteController(ISiteService siteService) {
        this.siteService = siteService;
    }

    @ApiOperation(value = "Get the site list.")
    @GetMapping("${api-context-path}/sites")
    @ResponseBody
    public ResponseEntity<List<Site>> getSites() {
        List<Site> sites = siteService.getSites();
        return ResponseEntity.ok(sites);
    }
}
