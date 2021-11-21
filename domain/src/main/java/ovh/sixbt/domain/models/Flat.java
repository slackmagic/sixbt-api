package ovh.sixbt.domain.models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Flat {
    @NonNull
    String id;
    String name;
    int area;
    int rent;
}