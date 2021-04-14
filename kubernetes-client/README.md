# Kubernetes Client Native Application
Simple native image Spring Boot application that interacts with Kubernetes via the Fabric8 client.

Build the application by executing:

```
gradle clean bootBuildImage
```

After the image is generated, it can be executed by running:

```
kubectl create serviceaccount springnative
kubectl create clusterrolebinding springnative-role --clusterrole=edit --serviceaccount=default:springnative --namespace=default
kubectl apply -f k8s/client-pod.yaml
```

The logs in the Kubernetes pods should be similar to:

```
021-04-14 21:03:16.932  INFO 1 --- [           main] c.sitewhere.KubernetesClientApplication  : Starting KubernetesClientApplication using Java 1.8.0_282 on spring-native with PID 1 (/workspace/com.sitewhere.KubernetesClientApplication started by cnb in /workspace)
2021-04-14 21:03:16.932  INFO 1 --- [           main] c.sitewhere.KubernetesClientApplication  : No active profile set, falling back to default profiles: default
2021-04-14 21:03:16.984  INFO 1 --- [           main] com.sitewhere.KubernetesQuery            : Found 5 namespaces..
2021-04-14 21:03:16.984  INFO 1 --- [           main] com.sitewhere.KubernetesQuery            : Found namespace: default
2021-04-14 21:03:16.984  INFO 1 --- [           main] com.sitewhere.KubernetesQuery            : Found namespace: kube-node-lease
2021-04-14 21:03:16.984  INFO 1 --- [           main] com.sitewhere.KubernetesQuery            : Found namespace: kube-public
2021-04-14 21:03:16.984  INFO 1 --- [           main] com.sitewhere.KubernetesQuery            : Found namespace: kube-system
2021-04-14 21:03:16.984  INFO 1 --- [           main] com.sitewhere.KubernetesQuery            : Found namespace: metallb-system
2021-04-14 21:03:16.986  INFO 1 --- [           main] c.sitewhere.KubernetesClientApplication  : Started KubernetesClientApplication in 0.057 seconds (JVM running for 0.058)
```
