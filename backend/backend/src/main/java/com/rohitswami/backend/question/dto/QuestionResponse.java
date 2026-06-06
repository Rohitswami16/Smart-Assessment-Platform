package com.rohitswami.backend.question.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestionResponse {

    private String id;

    private String quizId;

    private String questionText;

    private List<String> options;
}