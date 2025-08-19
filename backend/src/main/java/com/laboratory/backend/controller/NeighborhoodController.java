package com.laboratory.backend.controller;

import com.laboratory.backend.model.NeighborhoodModel;
import com.laboratory.backend.service.NeighborhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/neighborhoods")
public class NeighborhoodController {

	@Autowired
	private NeighborhoodService neighborhoodService;

	@GetMapping
	public List<NeighborhoodModel> getAll() {
		return neighborhoodService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<NeighborhoodModel> getById(@PathVariable Integer id) {
		return neighborhoodService.findById(id);
	}

	@PostMapping
	public NeighborhoodModel create(@RequestBody NeighborhoodModel neighborhood) {
		return neighborhoodService.save(neighborhood);
	}

	@PutMapping("/{id}")
	public NeighborhoodModel update(@PathVariable Integer id, @RequestBody NeighborhoodModel neighborhood) {
		neighborhood.setId(id);
		return neighborhoodService.save(neighborhood);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		neighborhoodService.deleteById(id);
	}
}