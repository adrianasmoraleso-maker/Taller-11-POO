package org.taller;


// Clase abstracta que define el comportamiento común de todas las figuras
public abstract class Figura {

    //Ejercicio3:Intentar definir un método concreto en una case abstracta que sea necesaria de sobrescribir

    // Implementación genérica que no representa correctamente
    // el comportamiento de todas las figuras
    public double calcularArea() {
        return 0;
    }

    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}
//----------------------------------------------------------------------------------------------------------//
    /*
    // Método abstracto que obliga a las clases derivadas a implementar
    // su propia fórmula para calcular el área
    public abstract double calcularArea();

    // Método concreto que reutiliza el cálculo definido por cada subclase
    public void mostrarArea() {

        System.out.println("Área: " + calcularArea());
    }
}
*/
//----------------------------------------------------------------------------------------------------------//