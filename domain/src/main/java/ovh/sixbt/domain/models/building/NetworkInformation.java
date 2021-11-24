package ovh.sixbt.domain.models.building;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NetworkInformation {
    public String wifiSSID;
    public String wifiPassword;
}
