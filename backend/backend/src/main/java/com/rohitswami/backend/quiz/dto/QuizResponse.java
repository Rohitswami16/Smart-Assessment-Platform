package com.rohitswami.backend.quiz.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuizResponse {

    private String id;

    private String title;

    private String description;

    private Integer duration;

    private Boolean active;

    private String createdBy;
}