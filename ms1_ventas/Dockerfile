FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ventas-service.jar

EXPOSE 8092

ENTRYPOINT ["java","-jar","/ventas-service.jar"]