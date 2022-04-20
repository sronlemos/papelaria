CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) DEFAULT NULL,
  `data_cadastro` datetime default CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) 