package com.rohitswami.backend.result.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.rohitswami.backend.common.entity.BaseEntity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "results")
public class Result extends BaseEntity {

    @Id
    private String id;

    private String quizId;

    private String studentEmail;

    private Integer score;

    private Integer totalQuestions;

    private LocalDateTime submittedAt;
}