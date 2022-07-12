FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} compras-service.jar

EXPOSE 8093

ENTRYPOINT ["java","-jar","/compras-service.jar"]