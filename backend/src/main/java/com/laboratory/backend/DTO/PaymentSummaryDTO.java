package com.laboratory.backend.DTO;

public record PaymentSummaryDTO(
        Integer id,
        java.math.BigDecimal amount,
        java.math.BigDecimal paymentDate,
        com.laboratory.backend.enums.StatusPaymentTypes status
) {}
