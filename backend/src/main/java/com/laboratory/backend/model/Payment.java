package com.laboratory.backend.model;

import com.laboratory.backend.enums.StatusPaymentTypes;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "paymment_method_id", nullable = false)
    private PaymentMethod paymentMethod;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(name = "payment_date",nullable = false)
    private BigDecimal paymentDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusPaymentTypes status;
}
