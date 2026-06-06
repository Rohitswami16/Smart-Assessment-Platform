package com.rohitswami.backend.quiz.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "quizzes")
public class Quiz {

    @Id
    private String id;

    private String title;

    private String description;

    private Integer duration;

    private Boolean active;

    private String createdBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}