package com.rohitswami.backend.question.entity;
import com.rohitswami.backend.common.entity.BaseEntity;

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
public class Question extends BaseEntity {

    @Id
    private String id;

    private String quizId;

    private String questionText;

    private List<String> options;

    private Integer correctOptionIndex;

}
