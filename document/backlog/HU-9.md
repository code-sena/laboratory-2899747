# HU-9: Customer

## Definition
Register and manage customers who can make purchases.

## Description
Entity representing a customer, necessary for order management and sales.

### Attributes
- id (INT, PK, AUTO_INCREMENT)
- first_name (VARCHAR(100), not null)
- last_name (VARCHAR(100), not null)
- email (VARCHAR(100), unique, not null)
- phone (VARCHAR(20))
- address (VARCHAR(255))
- active (BOOLEAN, default TRUE)

## DoR
- Entity structure defined
- Fields normalized and validated

## DoD
- Customer registered in the database
- Uniqueness and format validation
- Integration with sales module

## Architecture
### Use Case
Register customer for order management.

### Class Diagram
Customer class with attributes and CRUD methods.

### SQL
Customer entity created.
