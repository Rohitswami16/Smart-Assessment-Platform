package com.rohitswami.backend.quiz.controller;

import com.rohitswami.backend.common.response.ApiResponse;
import java.security.Principal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @PreAuthorize("hasRole('TEACHER')")

    @PostMapping
    public ResponseEntity<ApiResponse<QuizResponse>> createQuiz(
            @Valid @RequestBody CreateQuizRequest request,
            Principal principal) {

        QuizResponse response
                = quizService.createQuiz(request, principal.getName());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        ApiResponse.<QuizResponse>builder()
                                .success(true)
                                .message("Quiz created successfully")
                                .data(response)
                                .build());
    }

    @GetMapping
    public ResponseEntity<List<QuizResponse>> getAllQuizzes() {

        return ResponseEntity.ok(
                quizService.getAllQuizzes());
    }
}
