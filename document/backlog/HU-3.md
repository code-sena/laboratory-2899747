# HU-3: Department

## Definition
Register and manage departments within countries for product and order location normalization.

## Description
Entity representing a department, necessary for the normalization of product and order locations.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- name (VARCHAR(100), unique, not null)
- active (BOOLEAN, default TRUE)
- country_id (INT, FK)

## DoR
- Entity structure defined
- Fields normalized and validated
- Relationship with country established

## DoD
- Department registered in the database
- Uniqueness and format validation
- Integration with location module

## Architecture
### Use Case
Register department for location normalization.

### Class Diagram
Department class with attributes and CRUD methods.

### SQL
Department entity created and related to country.
