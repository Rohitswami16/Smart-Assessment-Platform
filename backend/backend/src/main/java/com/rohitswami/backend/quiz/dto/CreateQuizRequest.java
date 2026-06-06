package com.rohitswami.backend.quiz.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateQuizRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotNull
    private Integer duration;
}