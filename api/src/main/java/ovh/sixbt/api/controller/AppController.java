package ovh.sixbt.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.ports.in.IContactService;

@Tag(description = "Some technical endpoints.", name = "Technical")
@RestController
public class AppController {
    private final IContactService contactService;
    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    public AppController(IContactService contactService) {
        this.contactService = contactService;
    }

    @Operation(summary = "Application health check.")
    @GetMapping("${api-context-path}/_")
    @ResponseBody
    public HealthCheckStatus healthCheck() {
        return new HealthCheckStatus("Everything's fine on " + applicationName);
    }

    public static class HealthCheckStatus {
        public final String status;

        HealthCheckStatus(final String status) {
            this.status = status;
        }
    }

}
