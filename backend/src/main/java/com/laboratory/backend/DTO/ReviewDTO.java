package com.laboratory.backend.DTO;

import lombok.Data;

@Data
public class ReviewDTO {
    private Integer productId;
    private Integer customerId;
    private Integer rating;
    private String comment;
    private Integer feedbackId;
}