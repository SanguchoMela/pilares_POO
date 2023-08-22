# Los 4 pilares de la Programación Orientada a Objetos (POO)
---
## Abstracción
### Definición
La abstracción en POO es un pilar que busca modelar el mundo real en clases y objetos simples centrandose en las características principales de un objetos y omite los detalles irrelevantes. Esta técnica oculta la funcionalidad interna de una aplicación a la vista del usuario, quien interactúa con esta a través de una interfaz.
### Ejemplo 
Implementar la abstracción en un programa sencillo para calcular el área y el perímetro de figuras geométricas en 2 dimensiones.

- Clase abstracta Figura2D con métodos sujetos a definición
<p align="center">
  <img src="images%2FclaseAbstracta.png" width="350px">
</p>

- Clases Cuadrado y Triangulo heredan los métodos de Figura2D y son implementados según la necesidad
<p align="center">
  <img src="images%2FclaseCuadrado.png" width="400px">
  <img src="images%2FclaseTriangulo.png" width="400px">
</p>

- Clase Calculo_Figuras2D para usar clases y métodos
<p align="center">
  <img src="images%2FclaseCalculo_Figuras2D.png" width="600px">
</p>

- Resultado
<p align="center">
  <img src="images%2FresultadoAbstraccion.png" width="300px">
</p>

## Encapsulamiento
### Definición
El encapsulamiento se encarga de ocultar los detalles internos de una clase, promoviendo la seguridad y la integridad de datos evitando que los objetos los se modifiquen sin autorización. Esto facilita la modificación interna del código sin afectar su uso externo, promoviendo su flexibilidad y mantenimiento.
### Ejemplo 
- Clase Libro con atributos, constructor y setters y getters
<p align="center">
  <img src="images%2FclaseLibro.png" width="450px">
</p>

- Clase Biblioteca con la lógica del funcionamiento de la misma, accede a los atributos de Libro mediante getters
<p align="center">
  <img src="images%2FclaseBiblioteca.png" width="550px">
</p>

- Clase RegistroBiblioteca para agregar libros y mostrarlos
<p align="center">
  <img src="images%2FclaseRegistroBiblioteca.png" width="550px">
</p>

- Resultado
<p align="center">
  <img src="images%2FresultadoEncapsulamiento.png" width="400px">
</p>

## Herencia
### Definición
La herencia en POO es la técnica que permite crear nuevas clases basadas en una o más ya existentes. La clase padre, principal o superclase contiene atributos y métodos comunes entre las clases que se derivarán de ella. Las subclases o clases derivadas heredan los atributos y métodos de la superclase, aunque también pueden tener los suyos propios. 
### Ejemplo 
- Clase Felino como superclase como atributo y método común
<p align="center">
  <img src="images%2FclaseFelino.png" width="500px">
</p>

- Clases Leon y Puma como subclases que heredan de la principal y añaden sus características propias
<p align="center">
  <img src="images%2FclaseLeon.png" width="600px">
  <img src="images%2FclasePuma.png" width="550px">
</p>

- Clase RegistroFelinos para la muestra de datos
<p align="center">
  <img src="images%2FclaseRegistroFelinos.png" width="500px">
</p>

- Resultado
<p align="center">
  <img src="images%2FresultadoHerencia.png" width="300px">
</p>

## Polimorfismo
### Definición
El polimorfismo es un pilar de POO que permite modificar el comportamiento de un método que ya fue previamente definido en una clase principal según el objeto que lo ejecute. Es posible construir métodos con el mismo nombre y en varias clases, pero que funcionen diferente en cada clase. 
### Ejemplo 
- Clase Animal como principal con un método común para sus clases derivadas
<p align="center">
  <img src="images%2FclaseAnimal.png" width="550px">
</p>

- Clases Burro y Lobo como subclases que sobreescriben un método según la necesidad
<p align="center">
  <img src="images%2FclaseBurro.png" width="500px">
  <img src="images%2FclaseLobo.png" width="500px">
</p>

- Clase Sonido_Animales que muestra el uso del método sobreescrito
<p align="center">
  <img src="images%2FclaseSonido_Animales.png" width="350px">
</p>

- Resultado
<p align="center">
  <img src="images%2FresultadoPolimorfismo.png" width="300px">
</p>
