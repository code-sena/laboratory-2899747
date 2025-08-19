package com.laboratory.backend.service;

import com.laboratory.backend.DTO.ReviewDTO;
import com.laboratory.backend.model.Review;
import com.laboratory.backend.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public boolean validateFields(ReviewDTO dto) {
        return dto.getRating() != null && dto.getRating() >= 1 && dto.getRating() <= 5
            && dto.getProductId() != null && dto.getCustomerId() != null;
    }

    public Review createReview(ReviewDTO dto) {
        if (!validateFields(dto)) return null;
        Review review = new Review();
        review.setProductId(dto.getProductId());
        review.setCustomerId(dto.getCustomerId());
        review.setRating(dto.getRating());
        review.setComment(dto.getComment());
        review.setFeedbackId(dto.getFeedbackId());
        return reviewRepository.save(review);
    }

    public Optional<Review> getReviewById(Integer id) {
        return reviewRepository.findById(id);
    }

    public List<Review> getReviewsByProduct(Integer productId) {
        return reviewRepository.findByProductId(productId);
    }

    public Review updateReview(Integer id, ReviewDTO dto) {
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isEmpty() || !validateFields(dto)) return null;
        Review review = optionalReview.get();
        review.setRating(dto.getRating());
        review.setComment(dto.getComment());
        review.setFeedbackId(dto.getFeedbackId());
        return reviewRepository.save(review);
    }

    public boolean deleteReview(Integer id) {
        if (!reviewRepository.existsById(id)) return false;
        reviewRepository.deleteById(id);
        return true;
    }

    public List<Review> listAllReviews() {
        return reviewRepository.findAll();
    }

    public boolean integrateWithFeedback(Integer reviewId, Integer feedbackId) {
        Optional<Review> optionalReview = reviewRepository.findById(reviewId);
        if (optionalReview.isEmpty()) return false;
        Review review = optionalReview.get();
        review.setFeedbackId(feedbackId);
        reviewRepository.save(review);
        return true;
    }
}