# HU-6: Product

## Definition
Register and manage products available for sale in the system.

## Description
Entity representing a product, necessary for inventory management and sales.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- name (VARCHAR(100), not null)
- description (TEXT)
- price (DECIMAL(10,2), not null)
- stock (INT, not null)
- active (BOOLEAN, default TRUE)
- category_id (INT, FK)

## DoR
- Entity structure defined
- Fields normalized and validated
- Relationship with category established

## DoD
- Product registered in the database
- Uniqueness and format validation
- Integration with inventory module

## Architecture
### Use Case
Register product for inventory and sales.

### Class Diagram
Product class with attributes and CRUD methods.

### SQL
Product entity created and related to category.
