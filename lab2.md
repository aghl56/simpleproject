# Технология разработки программного обеспечения
## Лабораторная работа №2: создание кластера Kubernetes и деплой приложения
### Витушкина Анна Максимовна, группа 3МБД2001
Целью лабораторной работы является знакомство с кластерной архитектурой на примере Kubernetes, а также деплоем приложения в кластер.
#### Манифест deployment.yaml
```
apiVersion: apps/v1
    kind: Deployment
    metadata:
      name: my-deployment
    spec:
      replicas: 3
      selector:
        matchLabels:
          app: my-app
      strategy:
        rollingUpdate:
          maxSurge: 1
          maxUnavailable: 1
        type: RollingUpdate
      template:
        metadata:
          labels:
            app: my-app
        spec:
          containers:
            - image: myproject:latest
              # https://medium.com/bb-tutorials-and-thoughts/how-to-use-own-local-doker-images-with-minikube-2c1ed0b0968
              imagePullPolicy: Never 
              name: myproject
              ports:
                - containerPort: 8080
          hostAliases:
          - ip: "192.168.49.1" # The IP of localhost from MiniKube
            hostnames:
            - postgres.local
```
#### Манифест service.yaml
```
    apiVersion: v1
    kind: Service
    metadata:
      name: my-service
    spec:
      type: NodePort
      ports:
        - nodePort: 31317
          port: 8080
          protocol: TCP
          targetPort: 8080
      selector:
        app: my-app
```
#### Скриншот шага 3.3
[step 3.3](http://prntscr.com/vep8nx)
#### Скриншот шага 3.5
[step 3.5](http://prntscr.com/vepbhi)
#### Видео с обзором созданного кластера
[Ссылка на видео](https://yadi.sk/i/IfOZb9WoJWxlZw)
