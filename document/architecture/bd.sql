-- Carrit de compras
DROP DATABASE IF EXISTS shopping_cart;
CREATE DATABASE shopping_cart;
USE shopping_cart;

-- Tables
CREATE TABLE payment (
  id INT NOT NULL AUTO_INCREMENT,
  order_id INT NOT NULL,
  paymment_method_id INT NOT NULL,
  amount DECIMAL(10, 2) NOT NULL,
  payment_date DATETIME NOT NULL,
  status VARCHAR(50) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (order_id) REFERENCES order(id),
  FOREIGN KEY (payment_method_id) REFERENCES payment_method(id)
);

-- entity Shipment
CREATE TABLE Shipment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT NOT NULL,
    shipment_date DATETIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    tracking_number VARCHAR(100) UNIQUE,
    FOREIGN KEY (order_id) REFERENCES Order(id)
);

