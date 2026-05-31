package org.taller;

public class PruebaEmpleado {

    //Ejercicio3: Uso incorrecto de Clases abstractas
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carlos"); //Se intentó instanciar la clase abstracta Empleado directamente

        empleado.mostrarDetalles();
    }
}

/* EXPLICACIÓN:
* Las clases abstractas no pueden instanciarse directamente porque representan una plantilla
* o modelo general para otras clases. Su propósito es definir atributos y comportamientos comunes
* que deberán ser completados por las clases derivadas. Por esta razón, Java impide crear objetos
* de una clase abstracta.
*/

//----------------------------------------------------------------------------------------------------------//
        /*

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
*/
//----------------------------------------------------------------------------------------------------------//