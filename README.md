# h201S5_02FernandoCanales

## Se utilizó
---

- Java SDK 11

- Apache Maven 3.4.8

- Spring Boot 2.7.1

- Postman

## Cómo empezar

### Registrar productos

Guardar compra

__URL:__ localhost:8093/compras/save

Buscar producto

__URL:__ localhost:8093/compras/all

Buscar producto por Id

__URL:__ localhost:8093/compras/product/{id}

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
  "name": "Pícaras",
  "amount": 20,
  "price": "1.2"
}
```

### Registrar Ventas

Registrar venta

__URL:__ localhost:8092/venta/save

Buscar producto desde venta

__URL:__ localhost:8092/venta/product/{id}

Mostrar todas las ventas

__URL:__ localhost:8092/venta/all

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

## Microservicios

### Servicio Eureka
---

__Descripción__

Servicio que inicia el servidor Eureka.

__Dependencias__

- Eureka Server

__Puerto:__ 8091

### Servicio Ventas
---

__Descripción__

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

__Descripción__

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

__Descripción__

Este servicio se encarga de registrar las nuevas ventas y aumentar
y reducir el stock según sea necesario.

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