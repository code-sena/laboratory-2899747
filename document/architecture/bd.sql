-- Carrit de compras
DROP DATABASE IF EXISTS shopping_cart;
CREATE DATABASE shopping_cart;
USE shopping_cart;

CREATE TABLE Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    active BOOLEAN DEFAULT TRUE,
    country_id INT NOT NULL,
    FOREIGN KEY (country_id) REFERENCES Country(id)
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


CREATE TABLE category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    active BOOLEAN NOT NULL DEFAULT TRUE
);