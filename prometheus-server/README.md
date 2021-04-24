# Prometheus Server Native Application
Simple native image Spring Boot application that creates a Prometheus server as part of component startup lifecycle.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
docker run --rm docker.io/sitewhere/prometheus-server:1.0.0
```

Output should be similar to:

```
2021-04-24 14:46:59.920  INFO 1 --- [           main] o.s.nativex.NativeListener               : This application is bootstrapped with code generated with Spring AOT

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.5)

2021-04-24 14:46:59.921  INFO 1 --- [           main] c.sitewhere.PrometheusServerApplication  : Starting PrometheusServerApplication using Java 1.8.0_282 on 36e720fb6124 with PID 1 (/workspace/com.sitewhere.PrometheusServerApplication started by cnb in /workspace)
2021-04-24 14:46:59.921  INFO 1 --- [           main] c.sitewhere.PrometheusServerApplication  : No active profile set, falling back to default profiles: default
2021-04-24 14:46:59.926  INFO 1 --- [           main] com.sitewhere.PrometheusServer           : Starting metrics server...
2021-04-24 14:47:00.927  INFO 1 --- [           main] com.sitewhere.PrometheusServer           : Timer observed wait of 1.000100417ms
2021-04-24 14:47:00.927  INFO 1 --- [           main] com.sitewhere.PrometheusServer           : Stopped metrics server.
2021-04-24 14:47:00.928  INFO 1 --- [           main] c.sitewhere.PrometheusServerApplication  : Started PrometheusServerApplication in 1.012 seconds (JVM running for 1.013)
```
