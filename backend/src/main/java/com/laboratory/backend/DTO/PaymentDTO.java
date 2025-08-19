package com.laboratory.backend.DTO;

public record PaymentDTO(
        Integer id,
        Integer orderId,
        Integer paymentMethodId,
        java.math.BigDecimal amount,
        java.math.BigDecimal paymentDate,
        com.laboratory.backend.enums.StatusPaymentTypes status
) {}
