package com.rohitswami.backend.question.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rohitswami.backend.question.dto.CreateQuestionRequest;
import com.rohitswami.backend.question.dto.QuestionResponse;
import com.rohitswami.backend.question.service.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<QuestionResponse> addQuestion(
            @Valid @RequestBody CreateQuestionRequest request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(questionService.addQuestion(request));
    }

    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<QuestionResponse>> getQuestionsByQuizId(
            @PathVariable String quizId) {

        return ResponseEntity.ok(
                questionService.getQuestionsByQuizId(quizId));
    }
}