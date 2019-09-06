package com.unlam.triangulo;

public class Triangulo {
    private double l1, l2, l3;

    public Triangulo(double l1, double l2, double l3) throws Exception {
        if((l1 < 0 || l2 < 0 || l3 < 0) || (l1 + l2 < l3 || l2 + l3 < l1 || l3 + l1 < l2)) {
            throw new Exception("Error: No es un triangulo");
        }
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public TipoTriangulo obtenerTipoTriangulo() {
        if (this.getL1() == this.getL2() && this.getL2() == this.getL3()) {
            return TipoTriangulo.EQUILATERO;
        } else if (this.getL1() != this.getL2() && this.getL2() != this.getL3() && this.getL1() != this.getL3()) {
            return TipoTriangulo.ESCALENO;
        } else {
            return TipoTriangulo.ISOSCELES;
        }
    }
}