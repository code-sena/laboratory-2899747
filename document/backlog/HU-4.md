# HU-4: City

## Definition
Register and manage cities within departments for product and order location normalization.

## Description
Entity representing a city, necessary for the normalization of product and order locations.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- name (VARCHAR(100), unique, not null)
- active (BOOLEAN, default TRUE)
- department_id (INT, FK)

## DoR
- Entity structure defined
- Fields normalized and validated
- Relationship with department established

## DoD
- City registered in the database
- Uniqueness and format validation
- Integration with location module

## Architecture
### Use Case
Register city for location normalization.

### Class Diagram
City class with attributes and CRUD methods.

### SQL
City entity created and related to department.
