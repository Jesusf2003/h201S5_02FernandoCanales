# h201S5_02FernandoCanales

## Microservicios

### ms0_eureka

Servicio que inicia el servidor Eureka.

__Dependencias__

- Eureka Server

__Puerto:__ 8091.

### ms1_ventas

Servicio que registra ventas y provoca la reducción del
stock de productos.

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