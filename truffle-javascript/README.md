# Truffle JavaScript Native Application
Simple native image Spring Boot application that executes JavaScript via the Truffle framework as part of component startup lifecycle.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
docker run --rm docker.io/sitewhere/truffle-javascript:1.0.0
```

Output should be similar to:

```
PS C:\Users\Derek\Documents\GitHub\spring-native\truffle-javascript> docker run --rm docker.io/sitewhere/truffle-javascript:1.0.0
2021-04-09 16:38:18.788  INFO 1 --- [           main] o.s.nativex.NativeListener               : This application is bootstrapped with code generated with Spring AOT

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.4)

2021-04-09 16:38:18.788  INFO 1 --- [           main] c.s.TruffleJavaScriptApplication         : Starting TruffleJavaScriptApplication using Java 1.8.0_282 on 3330f1a24ebb with PID 1 (/workspace/com.sitewhere.TruffleJavaScriptApplication started by cnb in /workspace)
2021-04-09 16:38:18.789  INFO 1 --- [           main] c.s.TruffleJavaScriptApplication         : No active profile set, falling back to default profiles: default
2021-04-09 16:38:18.794  INFO 1 --- [           main] com.sitewhere.JavaScriptExample          : Found JavaScript value: 42
2021-04-09 16:38:18.795  INFO 1 --- [           main] c.s.TruffleJavaScriptApplication         : Started TruffleJavaScriptApplication in 0.01 seconds (JVM running for 0.011)
```
