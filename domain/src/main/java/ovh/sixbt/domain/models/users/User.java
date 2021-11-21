package ovh.sixbt.domain.models.users;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String fullName;
    String email;
    String name;
    String password;
}
