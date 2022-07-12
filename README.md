# h201S5_02FernandoCanales

## Se usó
---

- Java SDK 11

- Apache Maven 3.4.8

- Spring Boot 2.7.1

- Postman

## Cómo empezar

1. Correr todos los servicios.

2. Registrar productos de prueba

    - Enlace
    
```json
{
    "id": "1",
    "name": "Coca Cola",
    "description": "Bebida gaseosa",
    "price": 2.50
},
{
    "id": "2",
    "name": "Inka Cola",
    "description": "Bebida gaseosa",
    "price": 2.50
},
{
    "id": "3",
    "name": "Princesa",
    "description": "Barra de chocolate",
    "price": 1.20
},
{
    "id": "4",
    "name": "Picaras",
    "description": "Galleta de Vainilla y chocolate",
    "price": 1
},
{
    "id": "5",
    "name": "Papas Lays",
    "description": "Paquete de snacks",
    "price": 50.0
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