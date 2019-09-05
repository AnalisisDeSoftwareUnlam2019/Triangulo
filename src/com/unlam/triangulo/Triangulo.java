package com.unlam.triangulo;

public class Triangulo {
    private int l1, l2, l3;

    public Triangulo(int l1, int l2, int l3) throws Exception {
        if((l1 < 1 || l2 < 1 || l3 < 1) || (l1 + l2 < l3 || l2 + l3 < l1 || l3 + l1 < l2)) {
            throw new Exception("Noooo, eso no e triaaaangulo papi");
        }
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    public int getL3() {
        return l3;
    }

    public TipoTriangulo obtenerTipoTriangulo() {
        if (this.getL1() == this.getL2() && this.getL2() == this.getL3()) {
            return TipoTriangulo.EQUILATERO;
        } else if (this.getL1() != this.getL2() && this.getL2() != this.getL3() && this.getL1() != this.getL2()) {
            return TipoTriangulo.ESCALENO;
        } else {
            return TipoTriangulo.ISOSCELES;
        }
    }
}