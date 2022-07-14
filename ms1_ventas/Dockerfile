FROM openjdk:11

ARG JAR_FILE=target/ms1_Ventas-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} ventas-service.jar

EXPOSE 8092

ENTRYPOINT ["java","-jar","/ventas-service.jar"]