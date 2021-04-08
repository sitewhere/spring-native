# Hello World Native Application
Simple native image Spring Boot application that logs "Hello World!" as part of component startup lifecycle.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
docker run --rm docker.io/sitewhere/hello-world:1.0.0
```
