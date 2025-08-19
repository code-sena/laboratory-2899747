# HU-7: Category

## Definition
Register and manage product categories for classification.

## Description
Entity representing a category, necessary for organizing products in the inventory.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- name (VARCHAR(100), unique, not null)
- active (BOOLEAN, default TRUE)

## DoR
- Entity structure defined
- Fields normalized and validated

## DoD
- Category registered in the database
- Uniqueness and format validation
- Integration with inventory module

## Architecture
### Use Case
Register category for product classification.

### Class Diagram
Category class with attributes and CRUD methods.

### SQL
Category entity created.
