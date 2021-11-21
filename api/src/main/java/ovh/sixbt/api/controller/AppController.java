package ovh.sixbt.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.ports.in.IContactService;

import java.util.List;

@Api(description = "Technical endpoints.", tags = "Application")
@RestController
public class AppController {
    @Value("${spring.application.name}")
    private String applicationName;

    private final IContactService contactService;

    @Autowired
    public AppController(IContactService contactService) {
        this.contactService = contactService;
    }

    public static class HealthCheckStatus {
        public final String status;
        HealthCheckStatus(final String status) {
            this.status = status;
        }
    }


    @ApiOperation(value = "Application health check.")
    @GetMapping("${api-context-path}/_")
    @ResponseBody
    public HealthCheckStatus healthCheck() {
        return new HealthCheckStatus("Everything's fine on " + applicationName);
    }

}
