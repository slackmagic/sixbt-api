package ovh.sixbt.domain.models.contacts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@AllArgsConstructor
public class Contact {
    String lastName;
    String firstName;
    String addressLine1;
    String addressLine2;
    String postalCode;
    String town;
    String phone;
    @NonNull
    EContactCategory category;
    @NonNull
    EContactScope scope;
}
