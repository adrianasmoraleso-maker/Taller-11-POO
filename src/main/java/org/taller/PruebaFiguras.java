package org.taller;

public class PruebaFiguras {

    public static void main(String[] args) {

        // Se utilizan referencias de tipo Figura para demostrar polimorfismo
        System.out.println("=== Figuras ===");

        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.print("Círculo (radio=5) -> ");

        // Se ejecuta la implementación de calcularArea() correspondiente a Circulo
        circulo.mostrarArea();

        System.out.print("Rectángulo (4x6) -> ");

        // Se ejecuta la implementación de calcularArea() correspondiente a Rectangulo
        rectangulo.mostrarArea();
    }
}

// Ejercicio3 Explicación método concreto:

/*como se modificó el método calcularArea () de la clase Figura conviertiéndolo
 en un método concreto en vez de abstracto; y también se modificó la clase circulo
 para no sbrescribir dihco método. Esto no producirá error de compilación,
 pero al ejecutar el programa el valor del área será 0.0 ya que se utiliza
 la implementación genérica heredada desde Figura. Esto evidencia que calcularArea()
 debería declararse como abstracto, pues cada figura requiere una implementación
 específica para calcular su área correctamente.

 Por lo tanto, definir este método como concreto permite que las clases
 derivadas hereden un comportamiento incorrecto, afectando el principio
 de abstracción y el diseño orientado a objetos.
 */