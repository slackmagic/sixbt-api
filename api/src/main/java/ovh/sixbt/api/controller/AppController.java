package ovh.sixbt.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${spring.application.name}")
    private String applicationName;

    public static class HealthCheckStatus {
        public String status;

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
