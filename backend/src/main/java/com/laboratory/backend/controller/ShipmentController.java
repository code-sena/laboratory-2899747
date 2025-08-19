package com.laboratory.backend.controller;

import com.laboratory.backend.model.ShipmentModel;
import com.laboratory.backend.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping
    public List<ShipmentModel> getAll() {
        return shipmentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ShipmentModel> getById(@PathVariable Integer id) {
        return shipmentService.findById(id);
    }

    @PostMapping
    public ShipmentModel create(@RequestBody ShipmentModel shipment) {
        return shipmentService.save(shipment);
    }

    @PutMapping("/{id}")
    public ShipmentModel update(@PathVariable Integer id, @RequestBody ShipmentModel shipment) {
        shipment.setId(id);
        return shipmentService.save(shipment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        shipmentService.deleteById(id);
    }
}
