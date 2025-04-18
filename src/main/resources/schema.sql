CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       email VARCHAR(100) NOT NULL UNIQUE,
                       nickname VARCHAR(50) NOT NULL,
                       password VARCHAR(50) NOT NULL,
                       major VARCHAR(100),
                       type ENUM('student', 'org') NOT NULL
);
