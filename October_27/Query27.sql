/*1. Create a csv file with following details
ProductId,ProductDescription,ProductPrice
P1001       XYZ                 34000
P1002       ABC                 45000
Load data from above csv into database table product.*/
  
CREATE TABLE Product(product_id varchar(10),product_desc varchar(10),product_price int);

LOAD DATA INFILE 'D:\Java assignment\SQLAssignment\ProductLoad.csv'
INTO TABLE Product
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS; 

/*2. Create table called item with following attributes,
   itemId
   itemDesc
   itemPrice
 put  data into item table and export data in .csv format*/

CREATE TABLE Item(item_id varchar(10),item_desc varchar(50),item_price int);

INSERT INTO Item(item_id, item_desc, item_price) VALUES
('MOB101)' , 'Iphone 13', '119000'),
('MOB102' , 'Iphone 12', '60000'),
('MOB103' , 'Samsung Galaxy S21 Ultra', '1050000');
        
SELECT * INTO OUTFILE 'D:\Java assignment\SQLAssignment\ItemLoad.csv'
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY "'"
LINES TERMINATED BY  '\r\n'
FROM Item; 