package ovh.sixbt.domain.models.sites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Site {
    String name;
    String url;
    String openingHours;
    String phone;
    ESiteCategory category;
    Coordinates coordinates;
}
