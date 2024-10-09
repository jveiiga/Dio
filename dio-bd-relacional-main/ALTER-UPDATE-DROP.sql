-- Adicionar colunas de endereço à tabela "Usuarios"
ALTER TABLE Usuarios
ADD rua VARCHAR(100),
ADD numero VARCHAR(10),
ADD cidade VARCHAR(50),
ADD estado VARCHAR(50);

-- Copia os dados da tabela original para a nova tabela
UPDATE usuarios
SET rua = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 1), ',', -1),
    numero = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 2), ',', -1),
    cidade = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 3), ',', -1),
    estado = SUBSTRING_INDEX(endereco, ',', -1);

-- Postgresql
UPDATE usuarios
SET rua = split_part(endereco, ',', 1),
    numero = split_part(endereco, ',', 2),
    cidade = split_part(endereco, ',', 3),
    estado = split_part(endereco, ',', 4);

-- Exclusão da coluna "endereco" da tabela original
ALTER TABLE usuarios
DROP COLUMN endereco;
