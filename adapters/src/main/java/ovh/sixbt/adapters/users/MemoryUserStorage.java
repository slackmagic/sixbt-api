package ovh.sixbt.adapters.users;

import ovh.sixbt.domain.models.users.User;
import ovh.sixbt.domain.ports.out.IUserStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryUserStorage implements IUserStorage {

    private final List<User> users;

    public MemoryUserStorage() {
        User user = User.builder()
                .fullName("test user")
                .name("foo")
                .email("test")
                //password = bar
                .password("$2a$10$lMxlIahXe0AF/Zqg1IB.LO1EXeWLROEBSJibyjSyStCfRLFsReC7q")
                .build();

        users = new ArrayList<>();
        users.add(user);
    }

    @Override
    public Optional<User> getUserByName(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }
}
