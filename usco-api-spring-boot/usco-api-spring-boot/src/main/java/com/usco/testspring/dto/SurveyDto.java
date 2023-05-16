package com.usco.testspring.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyDto {

    private Integer idSurvey;

    private String nameSurvey;

    private String descriptionSurvey;

    private UserDto userSurvey;

    @JsonManagedReference
    private List<QuestionDto> questionsSurvey;
}
