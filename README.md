# h201S5_02FernandoCanales

## Microservicios

### ms0_eureka

Servicio que inicia el servidor Eureka.

__Dependencias__

- Eureka Server

__Puerto__

8091

### ms1_ventas

__Descripción__

Este servicio registra las ventas teniendo en cuenta un
producto como una transaccional en base de datos MongoDB.

__Dependencias__

- Lombok

- Web

- Actuator

- Data MongoDB

- OpenFeign

- Netflix Hystrix

- Eureka Client

__Puerto__

8092