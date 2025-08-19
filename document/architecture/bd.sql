-- Carrit de compras
DROP DATABASE IF EXISTS shopping_cart;
CREATE DATABASE shopping_cart;
USE shopping_cart;

-- entity Neighborhood
CREATE TABLE Neighborhood (
    id INT AUTO_INCREMET PRIMARY KEY,
    neighborhoodName VARCHAR(100) NOT NULL UNIQUE,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    city_id INT NOT NULL,
    FOREIGN KEY (city_id) REFERENCES City(id)
);

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
