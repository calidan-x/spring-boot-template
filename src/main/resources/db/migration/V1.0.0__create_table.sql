CREATE TABLE IF NOT EXISTS `user`
(
    `id`           BIGINT(20)  PRIMARY KEY AUTO_INCREMENT,
    `name`         VARCHAR(8),
    `age`          int,
    `created_time` DATETIME     NOT NULL,
    `updated_time` DATETIME     NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
