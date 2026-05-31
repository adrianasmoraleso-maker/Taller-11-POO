package org.taller;

// Circulo hereda de Figura e implementa el cálculo específico de su área
public class Circulo extends Figura {

    private double radio;

    // No se sobrescribe calcularArea() para evidenciar el problema de heredar
   // una implementación genérica cuando el método debería ser abstracto
    public Circulo(double radio) {

        this.radio = radio;
    }
}


    /*
    // Implementación obligatoria del método abstracto definido en Figura

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
*/