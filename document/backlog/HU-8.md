# HU-8: Inventory

## Definition
Manage the inventory of products, including stock levels and availability.

## Description
Entity representing the inventory, necessary for tracking product quantities and movements.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- product_id (INT, FK)
- quantity (INT, not null)
- last_update (DATETIME)

## DoR
- Entity structure defined
- Fields normalized and validated
- Relationship with product established

## DoD
- Inventory registered in the database
- Integration with inventory module

## Architecture
### Use Case
Manage inventory for products.

### Class Diagram
Inventory class with attributes and CRUD methods.

### SQL
Inventory entity created and related to product.
