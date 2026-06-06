package com.rohitswami.backend.quiz.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rohitswami.backend.quiz.dto.CreateQuizRequest;
import com.rohitswami.backend.quiz.dto.QuizResponse;
import com.rohitswami.backend.quiz.service.QuizService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/quizzes")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @PostMapping
    public ResponseEntity<QuizResponse> createQuiz(
            @Valid @RequestBody CreateQuizRequest request,
            Principal principal) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        quizService.createQuiz(
                                request,
                                principal.getName()));
    }

    @GetMapping
    public ResponseEntity<List<QuizResponse>> getAllQuizzes() {

        return ResponseEntity.ok(
                quizService.getAllQuizzes());
    }
}