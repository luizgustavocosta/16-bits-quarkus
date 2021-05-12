Docker image
 docker build -f src/main/docker/Dockerfile.jvm -t 16bits/service-4-k8s-jvm:0.0.1 .
 docker push 16bits/service-4-k8s-jvm:0.0.1
```bash
kubectl create namespace 16-bits
namespace/16-bits created
kubectl apply -f target/kubernetes/kubernetes.yml
service/service-4-k8s created
deployment.apps/service-4-k8s created 
```

Get replicaset
kubectl -n 16-bits get replicaset

To scale
kubectl scale deployment <deployment-name> --replicas=3 -n <namespace>
kubectl scale deployment.apps/service-4-k8s --replicas=2 -n 16-bits

kubectl scale deployment.apps/service-4-k8s --replicas=2 -n 16-bits 
deployment.apps/service-4-k8s scaled

Port Forwarding

kubectl port-forward service/service-4-k8s 8080:8080 -n 16-bits

// repeate request
for i in `seq 1 20`; do curl http://url; done

for i in `seq 1 2000`; do curl http://localhost:8080/hello-resteasy; done

