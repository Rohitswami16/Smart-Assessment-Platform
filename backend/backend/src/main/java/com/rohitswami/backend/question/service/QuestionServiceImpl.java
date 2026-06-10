package com.rohitswami.backend.question.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rohitswami.backend.question.dto.CreateQuestionRequest;
import com.rohitswami.backend.question.dto.QuestionResponse;
import com.rohitswami.backend.question.entity.Question;
import com.rohitswami.backend.question.repository.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public QuestionResponse addQuestion(CreateQuestionRequest request) {

        Question question = Question.builder()
                .quizId(request.getQuizId())
                .questionText(request.getQuestionText())
                .options(request.getOptions())
                .build();

        Question savedQuestion = questionRepository.save(question);

        return QuestionResponse.builder()
                .id(savedQuestion.getId())
                .quizId(savedQuestion.getQuizId())
                .questionText(savedQuestion.getQuestionText())
                .options(savedQuestion.getOptions())
                .build();
    }

    @Override
    public List<QuestionResponse> getQuestionsByQuizId(String quizId) {

        return questionRepository.findByQuizId(quizId)
                .stream()
                .map(question -> QuestionResponse.builder()
                        .id(question.getId())
                        .quizId(question.getQuizId())
                        .questionText(question.getQuestionText())
                        .options(question.getOptions())
                        .build())
                .toList();
    }
}