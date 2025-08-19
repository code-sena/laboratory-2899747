package com.laboratory.backend.DTO;

public class NeighborhoodDTO {
	private Integer id;
	private String neighborhoodName;
	private Boolean active;
	private Integer cityId;

    // Default constructor
    public NeighborhoodDTO() {
    }

    // Constructor
    public NeighborhoodDTO(Integer id, String neighborhoodName, Boolean active, Integer cityId) {
        this.id = id;
        this.neighborhoodName = neighborhoodName;
        this.active = active;
        this.cityId = cityId;
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
    public Integer getCityId() {
        return cityId;
    }
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}