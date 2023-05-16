package com.usco.testspring.dto;

import javax.validation.constraints.*;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CareerDtoUpdate {

    @NotBlank(message = "Title is required")
    private String title;

    @Min(0)
    @Max(100)
    private double lecturaCritica;
    @Min(0)
    @Max(100)
    private double cienciasNaturales;
    @Min(0)
    @Max(100)
    private double cienciasSociales;
    @Min(0)
    @Max(100)
    private double matematicas;
    @Min(0)
    @Max(100)
    private double ingles;

    private double puntajePonderado = 0.0;
    @Min(0)
    @Max(100)
    private double puntaCorte1;

    @Min(0)
    @Max(100)
    private double puntaCorte2;

    @NotNull(message = "Faculty is required")
    private UUID faculty;
}
