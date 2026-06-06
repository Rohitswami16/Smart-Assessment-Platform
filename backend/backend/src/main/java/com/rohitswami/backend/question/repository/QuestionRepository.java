package com.rohitswami.backend.question.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rohitswami.backend.question.entity.Question;

@Repository
public interface QuestionRepository
        extends MongoRepository<Question, String> {

    List<Question> findByQuizId(String quizId);
}