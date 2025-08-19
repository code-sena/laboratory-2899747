package com.laboratory.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratory.backend.DTO.ReviewDTO;
import com.laboratory.backend.model.Review;
import com.laboratory.backend.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody ReviewDTO dto) {
        Review review = reviewService.createReview(dto);
        if (review == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(review);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable Integer id) {
        return reviewService.getReviewById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/product/{productId}")
    public List<Review> getReviewsByProduct(@PathVariable Integer productId) {
        return reviewService.getReviewsByProduct(productId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Review> updateReview(@PathVariable Integer id, @RequestBody ReviewDTO dto) {
        Review review = reviewService.updateReview(id, dto);
        if (review == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(review);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Integer id) {
        if (reviewService.deleteReview(id)) return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Review> listAllReviews() {
        return reviewService.listAllReviews();
    }

    @PostMapping("/{id}/feedback/{feedbackId}")
    public ResponseEntity<Void> integrateWithFeedback(@PathVariable Integer id, @PathVariable Integer feedbackId) {
        if (reviewService.integrateWithFeedback(id, feedbackId)) return ResponseEntity.ok().build();
        return ResponseEntity.notFound().build();
    }
}