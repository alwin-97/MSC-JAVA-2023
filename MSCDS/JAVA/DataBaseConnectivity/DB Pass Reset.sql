SELECT * FROM mysql.user;
ALTER USER 'root'@'localhost' IDENTIFIED BY 'a_super_secure_password';
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password by '12345';
FLUSH PRIVILEGES;
