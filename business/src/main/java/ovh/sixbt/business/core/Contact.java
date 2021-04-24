package ovh.sixbt.business.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Contact {
    String lastName;
    String firstName;
    String phone;
}
