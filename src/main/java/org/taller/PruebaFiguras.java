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