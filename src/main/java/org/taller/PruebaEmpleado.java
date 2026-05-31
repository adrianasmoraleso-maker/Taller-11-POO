package org.taller;

public class PruebaEmpleado {

    public static void main(String[] args) {

        System.out.println("\n--------------- Gerente ---------------\n");

        // Se utiliza una referencia de tipo Empleado para demostrar polimorfismo
        Empleado gerente = new Gerente("Carlos Pérez", 3000, 500);
        gerente.mostrarDetalles();

        System.out.println("\n--------------- Vendedor ---------------\n");

        // Aunque la referencia es Empleado, se ejecuta la implementación
        // correspondiente al objeto Vendedor
        Empleado vendedor = new Vendedor("Ana Gómez", 2000, 800);
        vendedor.mostrarDetalles();
    }
}