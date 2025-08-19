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
create table city (
    id int primary key auto_increment,
    name varchar(100) not null unique,
    active boolean default true,
    department_id int not null,
    foreign key (department_id) references department(id)
);

-- entity Neighborhood
CREATE TABLE Neighborhood (
    id INT AUTO_INCREMET PRIMARY KEY,
    neighborhoodName VARCHAR(100) NOT NULL UNIQUE,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    city_id INT NOT NULL,
    FOREIGN KEY (city_id) REFERENCES City(id)
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

-- entity Shipment
CREATE TABLE Shipment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT NOT NULL,
    shipment_date DATETIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    tracking_number VARCHAR(100) UNIQUE,
    FOREIGN KEY (order_id) REFERENCES Order(id)
);

CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone VARCHAR(20),
    address VARCHAR(255),
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE Inventory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    last_update DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (product_id) REFERENCES Product(id)
);
CREATE TABLE Users (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    UserName VARCHAR(100) NOT NULL UNIQUE,
    Password VARCHAR(255) NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    Role VARCHAR(50) NOT NULL,
    Active BOOLEAN NOT NULL DEFAULT TRUE
);
CREATE TABLE ProductTracking (
  id INT AUTO_INCREMENT PRIMARY KEY,
  shipment_id INT NOT NULL,
  shipment_status_id INT NOT NULL,
  location VARCHAR(255),
  update_time DATETIME,
  FOREIGN KEY (shipment_id) REFERENCES Shipment(id),
  FOREIGN KEY (shipment_status_id) REFERENCES ShipmentStatus(id)
);

-- entity OrderDetail
CREATE TABLE OrderDetail (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES Orders(id),
    FOREIGN KEY (product_id) REFERENCES Products(id)
); 
