## Spring Boot Microservices - Spring Cloud exemple
Dans ce repo, nous allons voir des exemples de Spring Cloud : Service Discovery avec Eureka.

### Aperçu
---
Dans une architecture de microservice typique, de nombreuses petites applications sont déployées séparément et elles doivent souvent communiquer entre elles. Plus précisément, lorsque nous parlons de service client , nous entendons un service qui doit effectuer des appels REST vers un autre service final.

### Qu'est-ce que Micro-service ?
---
Les micro-services sont une approche d’architecture et de développement d’une application composée de petits services. L’idée étant de découper un grand problème en petites unités implémentée sous forme de micro-services.<br/><br/>
**Avantages d’une application basée sur micro-services** :
* Performances
* Redéploiement à chaud
* Technologies différentes
* Equipes indépendantes
* Facile à appliquer agilité et TDD

**Les cas d'utilsation de l'architecture microservices** :
* Application très large.
* Besion de scaler l'application.
* Des grandes équipes.

### Qu'est-ce que Spring Cloud et Netflix Eureka ?
---
**Spring Cloud** : Projet Spring pour créer des applications microservices, fournitregistration, configuration et Proxy service.<br/><br/>
**Netflix Eureka** est un serveur de recherche (également appelé registre). Tous les microservices du cluster s'enregistrent sur ce serveur. Lors d'un appel REST à un autre service, au lieu de fournir un nom d'hôte et un port, ils fournissent simplement le nom du service. Le routage réel est effectué au moment de l'exécution avec une répartition égale de la charge entre les services finaux. 

### Terminologie clé
---
* **Configuration service** : Est un microservice qui centralise la configuration de tousles micro-services.
* **Proxy service** : Dispatcher toutes les requêtes des clients vers les instances, donc ilfait équilibrage de charge (load balancer)
* **Spring cloud Gateway** : Est un proxy qui utilise un Model single threads avec IONon bloquantes
* **Circuit breakers** : Est un design pattern qui permet d'éviter une défaillance sur lesystème.
* **Hystrix** : C'est une implementation de Circuit breaker fournit par Netflix, qui donneun contrôle sur la latence et l'échec entre les services distribués. (spring-cloud-starter-hystrix)
* **Spring Sleuth** : est un outile qui va donner un ID unique à chaque requête à traversnos Microservices, de façon à pouvoir les suivre avec précision. (spring-cloud-starter-sleuth)
* **Zipkin** : Est une dépendence pour tracer et suivre des requêtes , C-à-d voir lechemin qu'une requête a parcouru afin de détecter où le problème s'est déclenché.(spring-cloud-sleuth-zipkin)
* **OpenFeign** : Faire communiquer les micro-services distants en mode synchrone, etbasé sur Ribbon pour faire l’équilibrage de charge (spring-cloud-starter-openfeign).

### Architecture globale
---
![Archi_globale](https://user-images.githubusercontent.com/75081354/150629583-19791a83-1258-4861-b35c-5bf01585b460.jpg)
