package com.laboratory.backend.DTO;

public record PaymentCreationDTO(
        Integer orderId,
        Integer paymentMethodId,
        java.math.BigDecimal amount,
        java.math.BigDecimal paymentDate,
        com.laboratory.backend.enums.StatusPaymentTypes status
) {}