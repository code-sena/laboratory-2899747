-- Carrit de compras
DROP DATABASE IF EXISTS shopping_cart;
CREATE DATABASE shopping_cart;
USE shopping_cart;


-- SupportTicket table
CREATE TABLE SupportTicket (
  id INT PRIMARY KEY AUTO_INCREMENT,
  customer_id INT NOT NULL,
  subject VARCHAR(100) NOT NULL,
  description TEXT,
  status VARCHAR(50) NOT NULL,
  created_at DATETIME NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES Customer(id)
);