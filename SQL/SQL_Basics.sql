create database if not exists tuf_db_1
create database tuf_db_2
show databases
drop database tuf_db_2
use tuf_db_1

CREATE TABLE IF NOT EXISTS users (
user_id INT,
user_name VARCHAR (30),
email VARCHAR (30),
is_active BOOLEAN,
account_balance DECIMAL,
signup_date_time DATETIME,
last_seen DATETIME
);

SHOW TABLES
DROP TABLES users

INSERT INTO users (user_id, user_name, email)
VALUE (03, 'Thorfinn', 'thor@gmail.com'), (04, 'Jay', 'jay@gmail.com'), (05, 'Captain Levi', 'levi@gmail.com')

INSERT INTO users (user_name, user_id, email)
VALUE ('Raj', 02, 'raj@gmail.com')

SELECT * FROM users;
SELECT user_name, email AS Email_ID FROM users; 