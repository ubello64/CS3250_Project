DROP TABLE IF EXISTS inventory;

CREATE TABLE inventory (
idx int(16)  NOT NULL AUTO_INCREMENT,
product_id VARCHAR(16),
quantity int(8),
wholesale_cost decimal(13, 2),
sale_price decimal(13, 2),
supplier_id VARCHAR(16),

PRIMARY KEY(idx)
);
