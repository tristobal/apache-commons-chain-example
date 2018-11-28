# Apache Commons Chain Example

Ejemplo de utilización de la librería commons-chain de Apache que
implementa el patrón de diseño *Chain of Responsability*.

## Flujo simulado

* Petición de sesión.
* Consumo de *Servicio 1* utilizando la sesión.
* Consumo de *Servicio 2* utilizando la sesión.
* Construcción de un objeto de respuesta a partir de la salida de
*Servicio 1* y *Servicio 2*.

## Ejecución

```
mvn spring:boot
```

## Requisitos

* Java 8
* Maven 3 o superior.