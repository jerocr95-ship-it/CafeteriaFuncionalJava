
# ☕ Sistema de Gestión de Cafetería con Programación Funcional en Java

## 1. Descripción del proyecto

Este proyecto consiste en el desarrollo de un sistema básico de gestión de productos para una cafetería, utilizando el lenguaje de programación Java y aplicando conceptos de programación funcional.

El programa permite consultar productos, filtrar precios, aplicar descuentos, generar números de pedido, buscar productos y calcular el valor total de los productos registrados.

El objetivo es demostrar cómo las expresiones lambda, las interfaces funcionales y Stream API permiten procesar información de manera organizada y eficiente.

## 2. Objetivo general

Aplicar los fundamentos de programación funcional en Java mediante el desarrollo de un sistema de cafetería que utilice expresiones lambda, interfaces funcionales y operaciones sobre colecciones de datos.

## 3. Productos del sistema

| Producto | Precio (UYU) |
|---|---:|
| Café americano | $120 |
| Espresso | $100 |
| Capuchino | $160 |
| Café con leche | $140 |

## 4. Interfaces funcionales utilizadas

### Predicate

Permite evaluar condiciones y filtrar los precios superiores a $120.

### Function

Permite transformar los precios aplicando un descuento del 10 %.

### Consumer

Permite mostrar en consola los productos disponibles.

### Supplier

Permite generar automáticamente un número de pedido aleatorio.

## 5. Operaciones de Stream API

El programa utiliza las siguientes operaciones:

- `filter()`: selecciona elementos que cumplen una condición.
- `map()`: transforma los precios aplicando descuentos.
- `reduce()`: calcula la suma de los precios.
- `collect()`: reúne los productos filtrados en una nueva lista.

## 6. Uso de Optional

Se utiliza `Optional` para gestionar el resultado de la búsqueda de un producto.

Cuando el producto existe, el sistema muestra su nombre. Si no existe, presenta un mensaje indicando que no fue encontrado.

## 7. Resultados obtenidos

Durante la ejecución del programa se verificaron los siguientes resultados:

- Se mostraron cuatro productos de la cafetería.
- Se identificaron dos precios superiores a $120.
- Se aplicó correctamente un descuento del 10 %.
- Se generó un número de pedido aleatorio.
- Se encontró correctamente el producto Espresso.
- Se calculó una suma de precios de $520 uruguayos.
- Se filtraron tres productos según la longitud de sus nombres.

Los resultados corresponden a operaciones sobre un catálogo de productos y no representan ventas registradas.

## 8. Herramientas utilizadas

- Java.
- Visual Studio Code.
- Java Development Kit (JDK).
- GitHub para almacenar el proyecto.
- ChatGPT como herramienta de apoyo académico.

## 9. Uso de inteligencia artificial

Durante el desarrollo del proyecto se utilizó ChatGPT como herramienta de apoyo para comprender los conceptos de programación funcional, estructurar el código y orientar su ejecución.

El programa fue ejecutado en Visual Studio Code y sus resultados fueron revisados para comprobar el funcionamiento de las operaciones implementadas.

La inteligencia artificial se utilizó como recurso de aprendizaje y acompañamiento durante el desarrollo de la actividad.

## 10. Limitaciones del programa

El sistema es una demostración académica de programación funcional.

Actualmente no cuenta con una base de datos, registro permanente de pedidos, control de inventario ni almacenamiento de ventas.

Estas funcionalidades podrían incorporarse en futuras versiones.

## 11. Conclusiones

El desarrollo de este proyecto permitió comprender la aplicación de la programación funcional en Java.

Se utilizaron expresiones lambda e interfaces funcionales para realizar operaciones sobre listas de productos y precios.

También se comprobó que Stream API facilita el filtrado, la transformación y el procesamiento de colecciones.

Esta actividad permitió fortalecer los conocimientos de programación y comprender cómo aplicar estos conceptos al desarrollo de sistemas comerciales.

## 12. Autor

**Estudiante:** Jerónimo Castaño Restrepo  
**Programa académico:** Ingeniería de Sistemas  
**Actividad:** Programación Funcional en Java  
**Modalidad de desarrollo:** Individual