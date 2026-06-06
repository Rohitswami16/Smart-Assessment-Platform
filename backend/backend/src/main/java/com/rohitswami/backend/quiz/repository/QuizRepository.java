package com.rohitswami.backend.quiz.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rohitswami.backend.quiz.entity.Quiz;

@Repository
public interface QuizRepository extends MongoRepository<Quiz, String> {

    List<Quiz> findByActive(Boolean active);

    List<Quiz> findByCreatedBy(String createdBy);
}