package com.laboratory.backend.repository;

import com.laboratory.backend.model.ShipmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShipmentRepository extends JpaRepository<ShipmentModel, Integer> {
    // Aquí podrías agregar queries personalizadas si es necesario
}
