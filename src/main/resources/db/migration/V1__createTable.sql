CREATE TABLE student(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    email varchar(50) NOT NULL,
    age DOUBLE,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;