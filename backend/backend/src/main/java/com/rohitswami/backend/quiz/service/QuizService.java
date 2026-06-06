package com.rohitswami.backend.quiz.service;

import java.util.List;

import com.rohitswami.backend.quiz.dto.CreateQuizRequest;
import com.rohitswami.backend.quiz.dto.QuizResponse;

public interface QuizService {

    QuizResponse createQuiz(CreateQuizRequest request, String createdBy);

    List<QuizResponse> getAllQuizzes();
}