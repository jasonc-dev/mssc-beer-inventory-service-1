package guru.sfg.common.events;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto implements Serializable {

    static final long serialVersionUID = -8430274238788230757L;

    @Null
    private UUID id;
    @Null
    private Integer version;

    @Null @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=Shape.STRING)
    private OffsetDateTime createdDate;

    @Null @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=Shape.STRING)
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private String beerStyle;

    @NotNull
    private String upc;

    @JsonFormat(shape=Shape.STRING)
    @NotNull @Positive
    private BigDecimal price;
    private Integer quantityOnHand;
}
