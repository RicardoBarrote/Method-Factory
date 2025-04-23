package method.factory.infrastructure.dto;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import method.factory.infrastructure.enums.UserTypeEnum;

public record UserRequestDto(@NotNull
                             @NotBlank
                             String name,
                             @NotNull
                             @NotBlank
                             String cpfOrCnpj,
                             @Enumerated
                             UserTypeEnum type) {
}
