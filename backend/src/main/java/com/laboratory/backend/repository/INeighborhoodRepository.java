package com.laboratory.backend.repository;

import com.laboratory.backend.model.NeighborhoodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INeighborhoodRepository extends JpaRepository<NeighborhoodModel, Integer> {
	// Métodos personalizados si se requieren
}