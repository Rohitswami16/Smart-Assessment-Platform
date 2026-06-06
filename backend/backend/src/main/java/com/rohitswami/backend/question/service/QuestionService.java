package com.rohitswami.backend.question.service;

import java.util.List;

import com.rohitswami.backend.question.dto.CreateQuestionRequest;
import com.rohitswami.backend.question.dto.QuestionResponse;

public interface QuestionService {

    QuestionResponse addQuestion(CreateQuestionRequest request);

    List<QuestionResponse> getQuestionsByQuizId(String quizId);
}