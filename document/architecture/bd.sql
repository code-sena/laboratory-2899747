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
CREATE TABLE Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    active BOOLEAN DEFAULT TRUE,
    country_id INT NOT NULL,
    FOREIGN KEY (country_id) REFERENCES Country(id)
);

CREATE TABLE Order(
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    order_date DATETIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customer(id)
);

-- Tables
CREATE TABLE Payment (
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

-- Tabla de reviews
CREATE TABLE review (
  id INT NOT NULL AUTO_INCREMENT,
  product_id INT NOT NULL,
  customer_id INT NOT NULL,
  rating INT NOT NULL CHECK (rating BETWEEN 1 AND 5),
  comment TEXT,
  created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  feedback_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (product_id) REFERENCES product(id),
  FOREIGN KEY (customer_id) REFERENCES customer(id),
  FOREIGN KEY (feedback_id) REFERENCES feedback(id)
);

CREATE TABLE Notification (
    id INT AUTO_INCREMENT PRIMARY KEY,      
    user_id INT NULL,                      
    customer_id INT NULL,                   
    message VARCHAR(255) NOT NULL,          
    sent_at DATETIME NOT NULL,              
    `read` BOOLEAN DEFAULT FALSE,           
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (customer_id) REFERENCES Customer(id)
);


