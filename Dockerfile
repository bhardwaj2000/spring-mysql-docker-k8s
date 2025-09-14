FROM openjdk:21
EXPOSE 8080
ADD target/spring-mysql-docker-k8s.jar spring-mysql-docker-k8s.jar
ENTRYPOINT ["java", "-jar", "/spring-mysql-docker-k8s.jar"]