## Spring Boot - Spring Cloud exemple
Dans ce repo, nous allons voir un exemple simple de Spring Cloud : Service Discovery avec Eureka.

### Exemple
---
Pour comprendre ce concept, nous allons construire trois services dans notre exemple :
* **Eureka Server** : agit comme un registre de services.
* **Movie Service** : un service REST simple qui fournit des informations sur les films.
* **Service de recommandation** : un simple service REST mais il appelle en interne le Movie Service pour compléter ses requêtes.

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes:<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce tuto nous allons utiliser les dependances de base suivants:<br/>
- Spring Web - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.<br/>
- Spring Boot DevTools - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.<br/>

### Exigences fonctionnelles
---


### Exécuter et tester
---