package com.laboratory.backend.service;

import com.laboratory.backend.DTO.PaymentCreationDTO;
import com.laboratory.backend.DTO.PaymentDTO;
import com.laboratory.backend.DTO.PaymentSummaryDTO;
import com.laboratory.backend.repository.IPaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService implements IPaymentService {

    private final IPaymentRepository iPaymentRepository;

    @Override
    public PaymentDTO createPayment(PaymentCreationDTO paymentCreationDTO) {
        return null;
    }

    @Override
    public List<PaymentSummaryDTO> findAllPayments() {
        return List.of();
    }

    @Override
    public PaymentDTO findPaymentById(Integer id) {
        return null;
    }

    @Override
    public PaymentDTO updatePaymentStatus(Integer id, String newStatus) {
        return null;
    }

    @Override
    public void deletePayment(Integer id) {

    }
}
