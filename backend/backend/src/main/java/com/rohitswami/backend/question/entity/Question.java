package com.rohitswami.backend.question.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "questions")
public class Question {

    @Id
    private String id;

    private String quizId;

    private String questionText;

    private List<String> options;

    private String correctAnswer;

    private LocalDateTime createdAt;
}