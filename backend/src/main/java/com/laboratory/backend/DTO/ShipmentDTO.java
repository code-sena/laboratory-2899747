package com.laboratory.backend.DTO;

import java.time.LocalDateTime;

public class ShipmentDTO {

    private Integer id;
    private Integer orderId;
    private LocalDateTime shipmentDate;
    private String status;
    private String trackingNumber;

    public ShipmentDTO() {
    }

    public ShipmentDTO(Integer id, Integer orderId, LocalDateTime shipmentDate, String status, String trackingNumber) {
        this.id = id;
        this.orderId = orderId;
        this.shipmentDate = shipmentDate;
        this.status = status;
        this.trackingNumber = trackingNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDateTime shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
