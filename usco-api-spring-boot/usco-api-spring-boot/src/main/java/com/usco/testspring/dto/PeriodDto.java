package com.usco.testspring.dto;
import javax.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PeriodDto {
    @NotBlank(message = "Period is required")
    private String period;
    @Min(value = 1, message = "Number of year must be greater than or equal to 1")
    private Long year;
}
