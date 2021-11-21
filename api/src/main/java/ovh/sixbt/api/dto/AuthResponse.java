package ovh.sixbt.api.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class AuthResponse {
    private final String accessToken;
}
