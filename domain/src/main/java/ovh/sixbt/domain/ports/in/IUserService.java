package ovh.sixbt.domain.ports.in;

import ovh.sixbt.domain.models.users.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> getUserByName(String name);
}
