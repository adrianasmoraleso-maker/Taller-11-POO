package org.taller;

// Rectangulo hereda de Figura e implementa su propia fórmula de área
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación específica del cálculo de área para un rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}