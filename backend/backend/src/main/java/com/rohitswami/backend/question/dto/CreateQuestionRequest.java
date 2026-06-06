package com.rohitswami.backend.question.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateQuestionRequest {

    @NotBlank
    private String quizId;

    @NotBlank
    private String questionText;

    @NotEmpty
    private List<String> options;

    @NotBlank
    private String correctAnswer;
}