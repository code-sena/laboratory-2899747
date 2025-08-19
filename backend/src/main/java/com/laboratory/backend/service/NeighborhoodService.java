package com.laboratory.backend.service;

import com.laboratory.backend.model.NeighborhoodModel;
import com.laboratory.backend.repository.INeighborhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NeighborhoodService {

	@Autowired
	private INeighborhoodRepository neighborhoodRepository;

	public List<NeighborhoodModel> findAll() {
		return neighborhoodRepository.findAll();
	}

	public Optional<NeighborhoodModel> findById(Integer id) {
		return neighborhoodRepository.findById(id);
	}

	public NeighborhoodModel save(NeighborhoodModel neighborhood) {
		return neighborhoodRepository.save(neighborhood);
	}

	public void deleteById(Integer id) {
		neighborhoodRepository.deleteById(id);
	}
}