package com.laboratory.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laboratory.backend.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findByProductId(Integer productId);
}