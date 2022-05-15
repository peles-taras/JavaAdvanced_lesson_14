DROP DATABASE IF EXISTS Lesson_14_db;
CREATE DATABASE Lesson_14_db;
USE Lesson_14_db;

CREATE TABLE item(
id INT NOT NULL PRIMARY KEY auto_increment,
total INT NOT NULL
);

CREATE TABLE cart (
id INT NOT NULL PRIMARY KEY auto_increment,
total INT NOT NULL,
name VARCHAR(255) NOT NULL
);

CREATE TABLE item_cart(
cart_id INT NOT NULL,
item_id INT NOT NULL,
CONSTRAINT cart_id_FK FOREIGN KEY(cart_id) REFERENCES Lesson_14_db.cart(id),
CONSTRAINT item_id_FK FOREIGN KEY(item_id) REFERENCES Lesson_14_db.item(id)
);

SELECT * FROM cart;
SELECT * FROM item;
SELECT * FROM item_cart;


