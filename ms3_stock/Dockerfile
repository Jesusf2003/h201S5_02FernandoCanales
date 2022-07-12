FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} stock-service.jar

EXPOSE 8094

ENTRYPOINT ["java","-jar","/stock-service.jar"]