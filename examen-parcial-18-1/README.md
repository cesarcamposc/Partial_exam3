# Examen Parcial - Diseño y Construcción de Software - Semestre 2018-1 - UNMSM-UPG-FISI

## Teoría (6 puntos)
### Pregunta 1. Explicar:
* Diseño de software.- son las 
son patrones arquitecturales 
* Patrón de diseño.- vien a ser los modelos propuestos a los problemas de diseño 

* Principios del diseño de software.- 

* Síntomas de un diseño pobre.-
	-rigidez
	-fragilidad
	-inmovilidad
	-viscosidad
	-compelidad innesaria
	-repeticion innecesaria
	-opacidad
	
	
* Atributo de calidad.-
Son aspectos del sistema que no afectan directamente a la funcionalidad, sino que definen la calidad del sistema. 
* Drivers arquitecturales.- son:
Requerimientos no funcionales
Atributos de calidad asociados a las caracteristicas que el Sw debe cumplir
restricciones de diseño que debe cumplir el SW, por ejemplo la ejecución asincrona de un proceso 


## Práctica (14 puntos)
Para cada pregunta presentar diseño UML y código fuente (agregar a ebautistau@unmsm.edu.pe como colaborador del repositorio github).
Los ejemplos propuestos NO pueden ser los vistos en clases, ni tampoco bajado de la web.

### Pregunta 2. (3 puntos)
- Construya un ejemplo en la que se aplique el principio: "Favorecer la composición de objetos frente a la herencia de clases".

### Pregunta 3. (3 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta3
- Mejorar la implementación de la red social Reddit.
- Soportar la red social Pinterest.
- Usar un contenedor IoC.
- Indicar los patrones y/o principios implementados.

### Pregunta 4. (2 puntos)
- Construya un ejemplo aplicando el patrón notification.

### Pregunta 5. (6 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta5
- Aplicar el patrón Abstract Factory para evitar exponer clases concretas (WhiteFinish, FastProcessor, etc) en el cliente (Client.java).
- El nuevo cliente (Client.java) debe mostrar la misma información.
