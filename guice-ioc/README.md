# Guice IOC Native Application
Simple native image Spring Boot application that uses Guice IOC as part of component startup lifecycle.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
docker run --rm docker.io/sitewhere/guice-ioc:1.0.0
```

Output should be similar to:

```
2021-04-24 15:37:54.238  INFO 1 --- [           main] o.s.nativex.NativeListener               : This application is bootstrapped with code generated with Spring AOT

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.5)

2021-04-24 15:37:54.238  INFO 1 --- [           main] com.sitewhere.GuiceIocApplication        : Starting GuiceIocApplication using Java 1.8.0_282 on c04341f4617a with PID 1 (/workspace/com.sitewhere.GuiceIocApplication started by cnb in /workspace)
2021-04-24 15:37:54.238  INFO 1 --- [           main] com.sitewhere.GuiceIocApplication        : No active profile set, falling back to default profiles: default
2021-04-24 15:37:54.243  INFO 1 --- [           main] com.sitewhere.GuiceExample               : Testing Guice IOC injection...
2021-04-24 15:37:54.244  INFO 1 --- [           main] com.sitewhere.GuiceExample               : Injector found 'Hello World!'
2021-04-24 15:37:54.245  INFO 1 --- [           main] com.sitewhere.GuiceIocApplication        : Started GuiceIocApplication in 0.009 seconds (JVM running for 0.011)
```
