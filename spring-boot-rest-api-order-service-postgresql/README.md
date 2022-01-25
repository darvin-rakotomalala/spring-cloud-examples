## Spring Cloud - Order Service exemple
Dans ce repo, nous allons voir un exemple simple de Spring Cloud avec le microservices Commande.

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes:<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce microservice nous allons utiliser les dependances de base suivants :
* **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.
* **Spring Data JPA** - sert à stocker et à récupérer des données entre une base de données relationnelle et un objet Java (POJO).
* **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.
* **PostgreSQL** - est destiné au pilote JDBC pour connecter les applications clientes à la base de données PostgreSQL.
* **springdoc-openapi-ui** - dépendances pour la documentation de l'API swagger 3.
* 
### Exécuter et tester
---
Pour tester les APIs vous pouvez utiliser Postman, Swagger, curl ou n'importe quel client HTTP :
- L'API d'URL POST `/api/orders` - ajouter un commande