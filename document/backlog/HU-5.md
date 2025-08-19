# HU-5: Neighborhood

## Definition
Register and manage neighborhoods within cities for product and order location normalization.

## Description
Entity representing a neighborhood, necessary for the normalization of product and order locations.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- name (VARCHAR(100), unique, not null)
- active (BOOLEAN, default TRUE)
- city_id (INT, FK)

## DoR
- Entity structure defined
- Fields normalized and validated
- Relationship with city established

## DoD
- Neighborhood registered in the database
- Uniqueness and format validation
- Integration with location module

## Architecture
### Use Case
Register neighborhood for location normalization.

### Class Diagram
Neighborhood class with attributes and CRUD methods.

### SQL
Neighborhood entity created and related to city.
