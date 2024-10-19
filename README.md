# Projeto Spring Boot

### Gleyson Sampaio - Instrutor Java

---

## Spring Framework

### Introdução ao Spring Boot

<h2>O que é Spring Boot?</h2>

<p>Spring Boot é uma extensão do Spring Framework que visa simplificar a configuração e o desenvolvimento de projetos. Enquanto o Spring Framework é baseado no padrão de injeção de dependências, o Spring Boot foca em configurações automáticas.</p>

---

### Antes do Spring Boot

<p>Os desafios com a configuração de projetos antes do Spring Boot incluíam:</p>
<ul>
    <li>Dependência individual</li>
    <li>Verbosidade</li>
    <li>Incompatibilidade de versões</li>
    <li>Complexidade de gestão</li>
    <li>Configurações complexas e repetitivas</li>
</ul>

---

<h2>Starters</h2>

<p>Starters são descritores de dependência pré-configurados que facilitam a integração de bibliotecas e módulos ao projeto. Eles trazem diversos benefícios:</p>
<ul>
    <li>Coesão</li>
    <li>Versões compatíveis</li>
    <li>Otimização do tempo</li>
    <li>Configuração simplificada</li>
    <li>Foco no negócio</li>
</ul>

<h3>Principais Starters</h3>

<ul>
    <li><code>spring-boot-starter-data-jpa</code>: Integração com banco de dados via JPA (Hibernate).</li>
    <li><code>spring-boot-starter-data-mongodb</code>: Interação com MongoDB.</li>
    <li><code>spring-boot-starter-web</code>: Inclusão do Tomcat para REST APIs.</li>
    <li><code>spring-boot-starter-web-services</code>: Webservices baseados em SOAP.</li>
    <li><code>spring-boot-starter-batch</code>: Implementação de jobs de processamento em batch.</li>
    <li><code>spring-boot-starter-test</code>: Ferramentas de teste como JUnit.</li>
    <li><code>spring-boot-starter-openfeign</code>: Cliente HTTP baseado em interfaces.</li>
    <li><code>spring-boot-starter-actuator</code>: Monitoramento e gerenciamento da aplicação.</li>
</ul>

---

<h2>Primeiros Passos</h2>

<ul>
    <li>Criando um projeto com o Spring Initializr</li>
    <li>Importando o projeto Maven no IntelliJ</li>
    <li>Conhecendo a estrutura do Spring Boot</li>
    <li>Uso de <code>@Bean</code> e <code>CommandLineRunner</code></li>
</ul>

---

<h2>Beans x Components</h2>

<p>Diferenças entre <code>@Bean</code> e <code>@Component</code>:</p>
<ul>
    <li>Quando usar <code>@Bean</code>?</li>
    <li>Quando usar <code>@Component</code>?</li>
    <li>Implementação de IoC (Inversão de Controle) e DI (Injeção de Dependências)</li>
</ul>

---

<h2>Singleton ou Prototype?</h2>

<ul>
    <li>Conceito de escopo (<i>scope</i>)</li>
    <li>Configuração de objetos Singleton</li>
    <li>Configuração de objetos Prototype</li>
</ul>

---

<h2>Properties e Values</h2>

<ul>
    <li>Configuração com o <code>application.properties</code></li>
    <li>Uso de <code>@Value</code> para injeção de propriedades</li>
    <li>Definição de valores padrões com <code>@Value</code></li>
</ul>

---

<h2>Configuration Properties</h2>

<ul>
    <li>Uso de <code>@ConfigurationProperties</code> com prefixos</li>
</ul>

---

<h2>Conceitos de ORM e JPA</h2>

<h3>O que é ORM?</h3>
<p>ORM (Object-Relational Mapping) é a técnica de mapeamento de objetos para tabelas relacionais. Isso facilita o desenvolvimento ao permitir que os desenvolvedores trabalhem diretamente com objetos Java, em vez de interagir com SQL diretamente.</p>

<h3>O que é JPA?</h3>
<p>JPA (Java Persistence API) é uma especificação que define como realizar operações de persistência em Java, sendo implementada por diversos frameworks, como Hibernate.</p>

<h3>Mapeamentos no JPA</h3>
<ul>
    <li>Identificação</li>
    <li>Definição</li>
    <li>Relacionamentos</li>
    <li>Herança</li>
    <li>Persistência</li>
</ul>

---

<h3>EntityManager</h3>

<p>O <code>EntityManager</code> é a interface principal para realizar operações com entidades no JPA.</p>

---

## Dúvidas?

<p>Participe do fórum do curso ou entre na comunidade online no <a href="https://discord.com/invite/eUrT2UFeS6">Discord</a>.</p>


