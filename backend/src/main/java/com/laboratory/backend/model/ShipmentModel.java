package com.laboratory.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shipments")
public class ShipmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "shipment_date", nullable = false)
    private LocalDateTime shipmentDate;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(name = "tracking_number", nullable = false, unique = true, length = 100)
    private String trackingNumber;

    public ShipmentModel() {
    }

    public ShipmentModel(Integer id, Integer orderId, LocalDateTime shipmentDate, String status, String trackingNumber) {
        this.id = id;
        this.orderId = orderId;
        this.shipmentDate = shipmentDate;
        this.status = status;
        this.trackingNumber = trackingNumber;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getOrderId() { return orderId; }
    public void setOrderId(Integer orderId) { this.orderId = orderId; }

    public LocalDateTime getShipmentDate() { return shipmentDate; }
    public void setShipmentDate(LocalDateTime shipmentDate) { this.shipmentDate = shipmentDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTrackingNumber() { return trackingNumber; }
    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }
}
