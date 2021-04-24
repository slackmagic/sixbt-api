package ovh.sixbt.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.business.core.Contact;
import ovh.sixbt.systems.IContactStorage;
import ovh.sixbt.systems.contact.MemoryContactStorage;
import java.util.List;

@RestController
public class AppController {
    @Value("${spring.application.name}")
    private String applicationName;

    private final IContactStorage contactStorage;

    public AppController() {
        this.contactStorage = new MemoryContactStorage();
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

    @GetMapping("${api-context-path}/public-contacts")
    @ResponseBody
    public List<Contact> getPublicContacts() {
        return contactStorage.getPublicContacts();
    }

    @GetMapping("${api-context-path}/private-contacts")
    @ResponseBody
    public List<Contact> getPrivateContacts() {
        return contactStorage.getPrivateContacts();
    }
}
