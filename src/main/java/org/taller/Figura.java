package org.taller;


// Clase abstracta que define el comportamiento común de todas las figuras
public abstract class Figura {

    // Método abstracto que obliga a las clases derivadas a implementar
    // su propia fórmula para calcular el área
    public abstract double calcularArea();

    // Método concreto que reutiliza el cálculo definido por cada subclase
    public void mostrarArea() {

        System.out.println("Área: " + calcularArea());
    }
}
