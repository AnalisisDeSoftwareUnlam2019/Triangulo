package com.unlam.triangulo;

public enum TipoTriangulo {

    ISOSCELES("Isosceles"), ESCALENO("Escaleno"), EQUILATERO("Equilatero");

    private String tipo;

    TipoTriangulo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
