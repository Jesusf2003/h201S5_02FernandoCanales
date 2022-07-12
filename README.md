# h201S5_02FernandoCanales

## Se utiliz�
---

- Java SDK 11

- Apache Maven 3.4.8

- Spring Boot 2.7.1

- Postman

## C�mo empezar

Los microservicios se deben ejecutar en el siguiente orden:

1. ms0_eureka

2. ms2_compras

3. ms1_ventas

### Registrar productos

Guardar compra

__POST:__ localhost:8093/compras/save

Buscar producto

__GET:__ localhost:8093/compras/all

Buscar producto por Id

__GET:__ localhost:8093/compras/product/{id}

```json
{
    "_id": "1",
    "name": "Coca Cola",
    "amount": 20,
    "price": "2.5"
},
{
    "_id": "2",
    "name": "Inka Cola",
    "amount": 20,
    "price": "2.5"
},
{
  "_id": "3",
  "name": "P�caras",
  "amount": 20,
  "price": "1.2"
}
```

### Registrar Ventas

Registrar venta

__POST:__ localhost:8092/venta/save

Buscar producto desde venta

__GET:__ localhost:8092/venta/product/{id}

Mostrar todas las ventas

__GET:__ localhost:8092/venta/all

```json
{
    "id": "1",
    "clientId": "1",
    "product": {
        "id": "1"
    },
    "status": "SUCCESS"
}
```

### Crear imagen de Docker

1. Crear un archivo de Dockerfile con el siguiente código

```dockerfile
FROM openjdk:11-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE port

ENTRYPOINT ["java","-jar","/app.jar"]
```

2. Instalar alpine y mongo con el siguiente comando:

> docker pull alpine:latest

> docker pull mongo:latest

3. Construir la imagen:

> docker build -t eureka-service .

En los microservicios que ocupan MongoDB en Docker:

> docker run -d --name mongo-on-docker -p 27017:27017 mongo

Correr la imagen en un contenedor

> docker run -d --name eureka-service -p 8091:8091 eureka-service

> docker run -d --name ventas-service -p 8092:8092 ventas-service

> docker run -d --name compras-service -p 8093:8093 compras-service

> docker run -d --name stock-service -p 8094:8094 stock-service

## Microservicios

### Servicio Eureka
---

__Descripci�n__

Servicio que inicia el servidor Eureka.

__Dependencias__

- Eureka Server

__Puerto:__ 8091

### Servicio Ventas
---

__Descripci�n__

Este servicio registra las ventas teniendo en cuenta un
producto como una transaccional en base de datos MongoDB.

__Dependencias__

- Lombok

- Web

- Actuator

- Data MongoDB

- OpenFeign

- Eureka Client

__Puerto:__ 8092

### Servicio Compras
---

__Descripci�n__

Este servicio registra las compras para almacenar nuevos productos
para alimentar a la venta - compra.

__Dependencias__

- Lombok

- Web

- Data MongoDB

- OpenFeign

- Eureka Client

__Puerto:__ 8093

### Servicio Stock
---

__Descripci�n__

Este servicio se encarga de registrar las nuevas ventas y aumentar
y reducir el stock seg�n sea necesario.

__Dependencias__

- Lombok

- Web

- Data MongoDB

- OpenFeign

- Eureka Client

__Puerto:__ 8094

## Base de datos
---

__Nombre:__ MongoDb

__Tipo:__ No relacional

__Nombre de base de datos:__ hackathon