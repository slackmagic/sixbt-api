package ovh.sixbt.api.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ovh.sixbt.domain.models.users.User;
import ovh.sixbt.domain.ports.in.IUserService;

@Service
public class AuthService implements UserDetailsService {
    private final IUserService userService;

    @Autowired
    public AuthService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByName(username).orElseThrow(() -> {
            throw new UsernameNotFoundException("User not found with username: " + username);});

        return new UserWithDetails(user);
    }
}
