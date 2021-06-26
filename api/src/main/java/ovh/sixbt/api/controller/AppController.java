package ovh.sixbt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.business.IContactService;
import ovh.sixbt.business.core.Contact;

import java.util.List;

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

    @GetMapping("${api-context-path}/_")
    @ResponseBody
    public HealthCheckStatus healthCheck() {
        return new HealthCheckStatus("Everything's fine on " + applicationName);
    }

}
