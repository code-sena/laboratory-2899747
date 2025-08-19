-- Carrit de compras
DROP DATABASE IF EXISTS shopping_cart;
CREATE DATABASE shopping_cart;
USE shopping_cart;

-- Tables
CREATE TABLE ProductTracking (
  id INT AUTO_INCREMENT PRIMARY KEY,
  shipment_id INT NOT NULL,
  shipment_status_id INT NOT NULL,
  location VARCHAR(255),
  update_time DATETIME,
  FOREIGN KEY (shipment_id) REFERENCES Shipment(id),
  FOREIGN KEY (shipment_status_id) REFERENCES ShipmentStatus(id)
);
