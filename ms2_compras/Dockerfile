FROM openjdk:11

ARG JAR_FILE=target/ms2_compras-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} compras-service.jar

VOLUME /tmp

EXPOSE 8093

ENTRYPOINT ["java","-jar","/compras-service.jar"]