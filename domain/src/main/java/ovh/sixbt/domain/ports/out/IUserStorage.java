package ovh.sixbt.domain.ports.out;

import ovh.sixbt.domain.models.users.User;

import java.util.Optional;

public interface IUserStorage {
    Optional<User> getUserByName(String name);
}
