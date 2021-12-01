CREATE TABLE `aluno` (
  `matricula` int NOT NULL,
  `nome_mae` varchar(100) DEFAULT NULL,
  `nome_pai` varchar(100) DEFAULT NULL,
  `data_matricula` date NOT NULL,
  `tel_responsavel` int DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `login` (`login`),
  CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`login`) REFERENCES `usuario` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `aluno_sala` (
  `cod_sala` int DEFAULT NULL,
  `matricula` int DEFAULT NULL,
  KEY `cod_sala` (`cod_sala`),
  KEY `matricula` (`matricula`),
  CONSTRAINT `aluno_sala_ibfk_1` FOREIGN KEY (`cod_sala`) REFERENCES `sala` (`cod_sala`),
  CONSTRAINT `aluno_sala_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `aluno` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `professor` (
  `cod_professor` int NOT NULL,
  `login` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_professor`),
  KEY `login` (`login`),
  CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`login`) REFERENCES `usuario` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `professor_aluno` (
  `cod_professor` int DEFAULT NULL,
  `matricula` int DEFAULT NULL,
  KEY `cod_professor` (`cod_professor`),
  KEY `matricula` (`matricula`),
  CONSTRAINT `professor_aluno_ibfk_1` FOREIGN KEY (`cod_professor`) REFERENCES `professor` (`cod_professor`),
  CONSTRAINT `professor_aluno_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `aluno` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `professor_sala` (
  `cod_professor` int DEFAULT NULL,
  `cod_sala` int DEFAULT NULL,
  KEY `cod_professor` (`cod_professor`),
  KEY `cod_sala` (`cod_sala`),
  CONSTRAINT `professor_sala_ibfk_1` FOREIGN KEY (`cod_professor`) REFERENCES `professor` (`cod_professor`),
  CONSTRAINT `professor_sala_ibfk_2` FOREIGN KEY (`cod_sala`) REFERENCES `sala` (`cod_sala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sala` (
  `cod_sala` int NOT NULL,
  `turma` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_sala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `secretaria` (
  `cod_secretaria` int NOT NULL,
  `login` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_secretaria`),
  KEY `login` (`login`),
  CONSTRAINT `secretaria_ibfk_1` FOREIGN KEY (`login`) REFERENCES `usuario` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `secretaria_aluno` (
  `cod_secretaria` int DEFAULT NULL,
  `matricula` int DEFAULT NULL,
  KEY `cod_secretaria` (`cod_secretaria`),
  KEY `matricula` (`matricula`),
  CONSTRAINT `secretaria_aluno_ibfk_1` FOREIGN KEY (`cod_secretaria`) REFERENCES `secretaria` (`cod_secretaria`),
  CONSTRAINT `secretaria_aluno_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `aluno` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usuario` (
  `login` varchar(10) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `rg` int NOT NULL,
  `telefone` int DEFAULT NULL,
  `data_nasc` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` int NOT NULL,
  `endereço` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
