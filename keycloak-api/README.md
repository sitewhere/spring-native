# Keycloak API Native Application
Simple native image Spring Boot application that accesses Keycloak API.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
cd docker
docker-compose up
```

After Keycloak bootstraps, output should be similar to:

```
sitewhere_1  | 2021-04-13 18:48:28.400  INFO 1 --- [           main] com.sitewhere.KeycloakApiExample         : Unable to connect to Keycloak. Waiting to retry...
sitewhere_1  | 2021-04-13 18:48:37.027  INFO 1 --- [           main] com.sitewhere.KeycloakApiExample         : Keycloak API validated as version '12.0.4'.
sitewhere_1  | 2021-04-13 18:48:37.027  INFO 1 --- [           main] com.sitewhere.KeycloakApiExample         : Keycloak API test finished.
sitewhere_1  | 2021-04-13 18:48:37.027  INFO 1 --- [           main] com.sitewhere.KeycloakNative             : Processed configuration.
sitewhere_1  | 2021-04-13 18:48:37.028  INFO 1 --- [           main] com.sitewhere.KeycloakApiApplication     : Started KeycloakApiApplication in 11.675 seconds (JVM running for 11.676)
```
