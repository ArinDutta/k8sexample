FROM openjdk:8-jdk-alpine
EXPOSE 8091
ARG JAR_FILE=target/k8sexample-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} k8.jar
ENTRYPOINT ["java","-jar","/k8.jar"]