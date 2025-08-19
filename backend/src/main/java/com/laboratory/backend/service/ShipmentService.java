package com.laboratory.backend.service;

import com.laboratory.backend.model.ShipmentModel;
import com.laboratory.backend.repository.IShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentService {

    @Autowired
    private IShipmentRepository shipmentRepository;

    public List<ShipmentModel> findAll() {
        return shipmentRepository.findAll();
    }

    public Optional<ShipmentModel> findById(Integer id) {
        return shipmentRepository.findById(id);
    }

    public ShipmentModel save(ShipmentModel shipment) {
        return shipmentRepository.save(shipment);
    }

    public void deleteById(Integer id) {
        shipmentRepository.deleteById(id);
    }
}
