package tech.devdiaries.springcloudbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import tech.devdiaries.springcloudbrewery.services.CustomerService;

import javax.validation.constraints.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20)
    private String name;
}
