package ovh.sixbt.domain.services;

import ovh.sixbt.domain.models.users.User;
import ovh.sixbt.domain.ports.in.IUserService;
import ovh.sixbt.domain.ports.out.IUserStorage;

import java.util.Optional;

public class UserService implements IUserService {
    private final IUserStorage userStorage;

    public UserService(IUserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public Optional<User> getUserByName(String name) {
        return userStorage.getUserByName(name);
    }
}
