FROM openjdk:11

ARG JAR_FILE=target/ms0_eureka-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} eureka-service.jar

EXPOSE 8091

ENTRYPOINT ["java","-jar","/eureka-service.jar"]