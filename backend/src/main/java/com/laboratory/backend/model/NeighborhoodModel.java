package com.laboratory.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Neighborhood")
public class NeighborhoodModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "neighborhoodName", nullable = false, unique = true, length = 100)
	private String neighborhoodName;

	@Column(nullable = false)
	private Boolean active = true;

	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city_id;
    
    // Constructors
    public NeighborhoodModel() {
    
    }

    public NeighborhoodModel(Integer id, String neighborhoodName, Boolean active, City city_id) {
        this.id = id;
        this.neighborhoodName = neighborhoodName;
        this.active = active;
        this.city_id = city_id;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public City getCity_id() {
        return city_id;
    }

    public void setCity_id(City city_id) {
        this.city_id = city_id;
    }


    
}