<h1>📚 Introdução a Bancos de Dados Relacionais</h1>
🎯 Objetivo Geral
<p>Este projeto visa oferecer uma introdução prática e teórica aos <strong>Bancos de Dados Relacionais</strong>. Ele abrange desde os conceitos fundamentais até consultas avançadas e operações em SQL.</p>
✅ Pré-requisitos
<ul> <li>💻 Computador com acesso à internet</li> <li>📖 Vontade de aprender!</li> </ul>
🗂️ Conteúdo Programático
<ul> <li><strong>Introdução aos Bancos de Dados Relacionais e SQL</strong>: <ul> <li>Conceitos básicos de banco de dados</li> <li>Modelagem de tabelas e registros</li> <li>Operações CRUD (Create, Read, Update, Delete)</li> <li>Chaves primárias e estrangeiras</li> <li>Normalização de dados</li> </ul> </li> <li><strong>Consultas e Operações Avançadas</strong>: <ul> <li>Junções e subconsultas</li> <li>Funções agregadas</li> <li>Agrupamento de resultados (GROUP BY e HAVING)</li> <li>Índices e otimização de consultas</li> </ul> </li> </ul>
🏛️ Estrutura de um Banco de Dados Relacional
<p>Um banco de dados relacional organiza os dados em tabelas, colunas e linhas:</p> <ul> <li><strong>Tabela</strong>: Conjunto de dados armazenados.</li> <li><strong>Coluna</strong>: Atributo específico da tabela.</li> <li><strong>Linha (Tupla)</strong>: Um registro específico.</li> <li><strong>Chaves</strong>: <ul> <li><strong>Primária</strong>: Identifica de forma única um registro.</li> <li><strong>Estrangeira</strong>: Relaciona registros entre tabelas.</li> </ul> </li> </ul>
🛠️ SQL - Linguagem de Consulta Estruturada
📝 Principais Categorias:
<ul> <li><strong>DQL (Data Query Language)</strong>: <code>SELECT</code></li> <li><strong>DML (Data Manipulation Language)</strong>: <code>INSERT</code>, <code>UPDATE</code>, <code>DELETE</code></li> <li><strong>DDL (Data Definition Language)</strong>: <code>CREATE</code>, <code>ALTER</code>, <code>DROP</code></li> <li><strong>DCL (Data Control Language)</strong>: <code>GRANT</code>, <code>REVOKE</code></li> <li><strong>DTL (Data Transaction Language)</strong>: <code>BEGIN</code>, <code>COMMIT</code>, <code>ROLLBACK</code></li> </ul>
📋 Exemplos de Comandos:
🏗️ Criar Tabela:

```sql
CREATE TABLE nome_tabela (
    id INT PRIMARY KEY,
    nome VARCHAR(100)
);
```
➕ Inserir Dados:
```sql
INSERT INTO nome_tabela (id, nome) VALUES (1, 'João');
```
🔍 Selecionar Dados:
```sql
SELECT * FROM nome_tabela WHERE id = 1;
```
✏️ Atualizar Dados:
```sql
UPDATE nome_tabela SET nome = 'Maria' WHERE id = 1;
```
🗑️ Excluir Dados:

```sql
Copiar código
DELETE FROM nome_tabela WHERE id = 1;
```

🔄 Normalização de Dados
<p>O processo de <strong>normalização</strong> elimina redundâncias e assegura a consistência dos dados:</p> <ol> <li><strong>Primeira Forma Normal (1FN)</strong>: Cada valor deve ser atômico.</li> <li><strong>Segunda Forma Normal (2FN)</strong>: Os atributos não chave devem depender totalmente da chave primária.</li> <li><strong>Terceira Forma Normal (3FN)</strong>: Nenhum atributo não chave deve depender de outro atributo não chave.</li> </ol>
🧑‍💻 Consultas Avançadas
🔗 Junções (JOINS):
<ul> <li><strong>INNER JOIN</strong>: Retorna apenas os registros correspondentes.</li> <li><strong>LEFT JOIN</strong>: Retorna todos os registros da tabela à esquerda.</li> <li><strong>RIGHT JOIN</strong>: Retorna todos os registros da tabela à direita.</li> <li><strong>FULL JOIN</strong>: Retorna todos os registros de ambas as tabelas.</li> </ul>
📊 Funções Agregadas:
<ul> <li><strong>COUNT</strong>: Conta o número de registros.</li> <li><strong>SUM</strong>: Soma os valores de uma coluna.</li> <li><strong>AVG</strong>: Calcula a média.</li> <li><strong>MIN</strong> e <strong>MAX</strong>: Retorna os valores mínimo e máximo.</li> </ul>

🤓 Hands On!
<a href="https://github.com/pamelaborges/dio-bd-relacional" target="_blank"></a></br></br>
📚 Referências
 
<ul>
<li><a href="https://www.github.com/pamelaborges/dio-bd-relacional" target="_blank">Repositório GitHub Pamela Borges</a></li>
<li><a href="https://www.oracle.com/br/database/what-is-a-relational-database/" target="_blank">Oracle - O que é um Banco de Dados Relacional?</a></li> 
<li><a href="https://mariadb.com/kb/en/data-types/" target="_blank">MariaDB - Tipos de Dados</a></li> 
<li><a href="https://pt.wikipedia.org/wiki/Normaliza%C3%A7%C3%A3o_de_dados" target="_blank">Wikipedia - Normalização de Dados</a></li> 
</ul>
