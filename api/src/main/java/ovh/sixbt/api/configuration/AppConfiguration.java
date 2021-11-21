package ovh.sixbt.api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ovh.sixbt.domain.ports.in.IContactService;
import ovh.sixbt.domain.ports.in.IFlatService;
import ovh.sixbt.domain.ports.out.IContactStorage;
import ovh.sixbt.domain.ports.out.IFlatStorage;
import ovh.sixbt.domain.services.ContactService;
import ovh.sixbt.domain.services.FlatService;
import ovh.sixbt.systems.contact.MemoryContactStorage;
import ovh.sixbt.systems.contact.MemoryFlatStorage;

@Configuration
public class AppConfiguration {

    @Bean
    IContactStorage contactStorage() {
        return new MemoryContactStorage();
    }

    @Bean
    @Autowired
    IContactService contactService(IContactStorage storage) {
        return new ContactService(storage);
    }

    @Bean
    IFlatStorage flatStorage() {
        return new MemoryFlatStorage();
    }

    @Bean
    @Autowired
    IFlatService flatService(IFlatStorage storage) {
        return new FlatService(storage);
    }


}
