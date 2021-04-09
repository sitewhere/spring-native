# Truffle JavaScript Native Application
Simple native image Spring Boot application that executes JavaScript via the Truffle framework as part of component startup lifecycle.

**This example currently generates an error due to AOT issues with Truffle dependencies**

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
PS C:\Users\Derek\Documents\GitHub\spring-native\truffle-javascript> gradle clean bootBuildImage
Starting a Gradle Daemon, 2 incompatible Daemons could not be reused, use --status for details

> Task :truffle-javascript:generateAot FAILED
WARNING: Unable to find jar 'C:\Users\Derek\Documents\GitHub\spring-native\truffle-javascript\build\resources\main' whilst scanning filesystem

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':truffle-javascript:generateAot'.
> Problem during scan of C:\Users\Derek\.gradle\caches\modules-2\files-2.1\org.graalvm.nativeimage\svm-hosted-native-linux-amd64\21.0.0.2\9d161e245e0eb74cf99ee036156ce26502a0177f\svm-hosted-native-linux-amd64-21.0.0.2.tar.gz
```
