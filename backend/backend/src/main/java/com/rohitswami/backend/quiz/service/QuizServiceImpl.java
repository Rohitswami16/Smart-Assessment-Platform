package com.rohitswami.backend.quiz.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rohitswami.backend.quiz.dto.CreateQuizRequest;
import com.rohitswami.backend.quiz.dto.QuizResponse;
import com.rohitswami.backend.quiz.entity.Quiz;
import com.rohitswami.backend.quiz.repository.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    @Override
    public QuizResponse createQuiz(
            CreateQuizRequest request,
            String createdBy) {

        Quiz quiz = Quiz.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .duration(request.getDuration())
                .active(true)
                .createdBy(createdBy)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        Quiz savedQuiz = quizRepository.save(quiz);

        return QuizResponse.builder()
                .id(savedQuiz.getId())
                .title(savedQuiz.getTitle())
                .description(savedQuiz.getDescription())
                .duration(savedQuiz.getDuration())
                .active(savedQuiz.getActive())
                .createdBy(savedQuiz.getCreatedBy())
                .build();
    }

    @Override
    public List<QuizResponse> getAllQuizzes() {

        return quizRepository.findAll()
                .stream()
                .map(quiz -> QuizResponse.builder()
                        .id(quiz.getId())
                        .title(quiz.getTitle())
                        .description(quiz.getDescription())
                        .duration(quiz.getDuration())
                        .active(quiz.getActive())
                        .createdBy(quiz.getCreatedBy())
                        .build())
                .toList();
    }
}