package ovh.sixbt.business.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Site {
    String name;
    ESiteCategory category;
    String coordinates;
}
