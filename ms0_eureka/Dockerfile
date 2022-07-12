FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} eureka-service.jar

EXPOSE 8091

ENTRYPOINT ["java","-jar","/eureka-service.jar"]