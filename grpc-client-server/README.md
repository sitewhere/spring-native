# GRPC Client/Server Native Application
Simple native image Spring Boot application that tests gRPC client/server interactions.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
docker run --rm docker.io/sitewhere/grpc-client-server:1.0.0
```

Output should be similar to:

```
2021-04-13 21:40:29.152  INFO 1 --- [           main] c.sitewhere.GrpcClientServerApplication  : Starting GrpcClientServerApplication using Java 1.8.0_282 on 12c6e49f1626 with PID 1 (/workspace/com.sitewhere.GrpcClientServerApplication started by cnb in /workspace)
2021-04-13 21:40:29.153  INFO 1 --- [           main] c.sitewhere.GrpcClientServerApplication  : No active profile set, falling back to default profiles: default
2021-04-13 21:40:29.157  INFO 1 --- [           main] com.sitewhere.GrpcServer                 : Starting gRPC server..
2021-04-13 21:40:29.159  INFO 1 --- [           main] com.sitewhere.GrpcServer                 : Server started. Attempting client request..
2021-04-13 21:40:29.163  INFO 1 --- [           main] com.sitewhere.GrpcServer                 : Successful request to gRPC server. Response was Atlanta 33.753746 -84.38633
2021-04-13 21:40:29.164  INFO 1 --- [           main] c.sitewhere.GrpcClientServerApplication  : Started GrpcClientServerApplication in 0.015 seconds (JVM running for 0.016)
```
