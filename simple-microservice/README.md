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

Output should be similar to:

```
PS C:\Users\Derek\Documents\GitHub\spring-native\hello-world> docker run --rm docker.io/sitewhere/hello-world:1.0.0
2021-04-08 22:53:03.021  INFO 1 --- [           main] o.s.nativex.NativeListener               : This application is bootstrapped with code generated with Spring AOT

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.4)

2021-04-08 22:53:03.021  INFO 1 --- [           main] com.sitewhere.HelloWorldApplication      : Starting HelloWorldApplication using Java 1.8.0_282 on 31231c96007b with PID 1 (/workspace/com.sitewhere.HelloWorldApplication started by cnb in /workspace)
2021-04-08 22:53:03.021  INFO 1 --- [           main] com.sitewhere.HelloWorldApplication      : No active profile set, falling back to default profiles: default
2021-04-08 22:53:03.026  INFO 1 --- [           main] com.sitewhere.HelloWorld                 : Hello World!
2021-04-08 22:53:03.027  INFO 1 --- [           main] com.sitewhere.HelloWorldApplication      : Started HelloWorldApplication in 0.009 seconds (JVM running for 0.01)
```
