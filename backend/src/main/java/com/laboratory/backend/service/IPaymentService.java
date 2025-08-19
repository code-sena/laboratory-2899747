package com.laboratory.backend.service;

import com.laboratory.backend.DTO.PaymentCreationDTO;
import com.laboratory.backend.DTO.PaymentDTO;
import com.laboratory.backend.DTO.PaymentSummaryDTO;

import java.util.List;

public interface IPaymentService {

    /**
     * Crea un nuevo pago en la base de datos a partir de un DTO.
     * @param paymentCreationDTO DTO que contiene los datos para el nuevo pago.
     * @return El DTO del pago recién creado.
     */
    PaymentDTO createPayment(PaymentCreationDTO paymentCreationDTO);

    /**
     * Obtiene una lista de todos los pagos, devolviendo una versión resumida (SummaryDTO).
     * @return Una lista de DTOs de resumen de pagos.
     */
    List<PaymentSummaryDTO> findAllPayments();

    /**
     * Busca y obtiene los detalles de un pago por su ID.
     * @param id El ID del pago a buscar.
     * @return El DTO del pago encontrado.
     */
    PaymentDTO findPaymentById(Integer id);

    /**
     * Actualiza el estado de un pago.
     * @param id El ID del pago a actualizar.
     * @param newStatus El nuevo estado del pago.
     * @return El DTO del pago actualizado.
     */
    PaymentDTO updatePaymentStatus(Integer id, String newStatus);

    /**
     * Elimina un pago de la base de datos por su ID.
     * @param id El ID del pago a eliminar.
     */
    void deletePayment(Integer id);
}