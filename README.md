# Los 4 pilares de la Programación Orientada a Objetos (POO)
---
## Abstracción
### Definición
La abstracción en POO es un pilar que busca modelar el mundo real en clases y objetos simples centrandose en las características principales de un objetos y omite los detalles irrelevantes. Esta técnica oculta la funcionalidad interna de una aplicación a la vista del usuario, quien interactúa con esta a través de una interfaz.
### Ejemplo 
Implementar la abstracción en un programa sencillo para calcular el área y el perímetro de figuras geométricas en 2 dimensiones.
- Clase abstracta Figura2D con métodos sujetos a definición
- Clases Cuadrado y Triangulo heredan los métodos de Figura2D y son implementados según la necesidad
- Clase Calculo_Figuras2D para usar clases y métodos
- Resultado

## Encapsulamiento
### Definición
El encapsulamiento se encarga de ocultar los detalles internos de una clase, promoviendo la seguridad y la integridad de datos evitando que los objetos los se modifiquen sin autorización. Esto facilita la modificación interna del código sin afectar su uso externo, promoviendo su flexibilidad y mantenimiento.
### Ejemplo 
- Clase Libro con atributos, constructor y setters y getters
- Clase Biblioteca con la lógica del funcionamiento de la misma, accede a los atributos de Libro mediante getters
- Clase RegistroBiblioteca para agregar libros y mostrarlos
- Resultado

## Herencia
### Definición
La herencia en POO es la técnica que permite crear nuevas clases basadas en una o más ya existentes. La clase padre, principal o superclase contiene atributos y métodos comunes entre las clases que se derivarán de ella. Las subclases o clases derivadas heredan los atributos y métodos de la superclase, aunque también pueden tener los suyos propios. 
### Ejemplo 
- Clase Felino como superclase como atributo y método común
- Clases Leon y Puma como subclases que heredan de la principal y añaden sus características propias
- Clase RegistroFelinos para la muestra de datos
- Resultado

## Polimorfismo
### Definición
El polimorfismo es un pilar de POO que permite modificar el comportamiento de un método que ya fue previamente definido en una clase principal según el objeto que lo ejecute. Es posible construir métodos con el mismo nombre y en varias clases, pero que funcionen diferente en cada clase. 
### Ejemplo 
- Clase Animal como principal con un método común para sus clases derivadas
- Clases Burro y Lobo como subclases que sobreescriben un método según la necesidad
- Clase Sonido_Animales que muestra el uso del método sobreescrito 
