package ovh.sixbt.api.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BenchTask {
    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    }
}
