## Spring Cloud - Product Service exemple
Dans ce repo, nous allons voir un exemple simple de Spring Cloud avec le microservices Produit.

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes:<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce tuto nous allons utiliser les dependances de base suivants :<br/>
- **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.<br/>
- **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.<br/>

### Exécuter et tester
---
Pour tester les APIs vous pouvez utiliser Postman, Swagger, curl ou n'importe quel client HTTP :
- L'API d'URL POST `/api/products` - ajouter un produit
- L'API d'URL GET `/api/products` - renvoie une liste de produit
- L'API d'URL GET `/api/products/{id}` - récupérer un produit par ID