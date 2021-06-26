package ovh.sixbt.api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ovh.sixbt.business.IContactService;
import ovh.sixbt.business.impl.DomainContactService;
import ovh.sixbt.systems.IContactStorage;
import ovh.sixbt.systems.contact.MemoryContactStorage;

@Configuration
public class AppConfiguration {

    @Bean
    IContactStorage contactStorage( ) {
        return new MemoryContactStorage();
    }

    @Bean
    @Autowired
    IContactService contactService(IContactStorage storage) {
        return new DomainContactService(storage);
    }
}
