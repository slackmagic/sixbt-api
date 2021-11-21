package ovh.sixbt.api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ovh.sixbt.adapters.contacts.MemoryContactStorage;
import ovh.sixbt.adapters.flats.MemoryFlatStorage;
import ovh.sixbt.adapters.sites.MemorySiteStorage;
import ovh.sixbt.adapters.users.MemoryUserStorage;
import ovh.sixbt.domain.ports.in.IContactService;
import ovh.sixbt.domain.ports.in.IFlatService;
import ovh.sixbt.domain.ports.in.ISiteService;
import ovh.sixbt.domain.ports.in.IUserService;
import ovh.sixbt.domain.ports.out.IContactStorage;
import ovh.sixbt.domain.ports.out.IFlatStorage;
import ovh.sixbt.domain.ports.out.ISiteStorage;
import ovh.sixbt.domain.ports.out.IUserStorage;
import ovh.sixbt.domain.services.ContactService;
import ovh.sixbt.domain.services.FlatService;
import ovh.sixbt.domain.services.SiteService;
import ovh.sixbt.domain.services.UserService;


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

    @Bean
    ISiteStorage siteStorage() {
        return new MemorySiteStorage();
    }

    @Bean
    @Autowired
    ISiteService siteService(ISiteStorage storage) {
        return new SiteService(storage);
    }

    @Bean
    IUserStorage userStorage() {
        return new MemoryUserStorage();
    }

    @Bean
    @Autowired
    IUserService userService(IUserStorage storage) {
        return new UserService(storage);
    }

}
