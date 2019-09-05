package com.unlam;

import com.unlam.triangulo.Triangulo;
import com.unlam.utils.ScannerUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        int l1, l2, l3;

        ArrayList<Entrada> list = new ArrayList<Entrada>();
        list.add(new Entrada(new Triangulo(1,1,1), "Equilatero"));

        list.add(new Entrada(new Triangulo(1,2,2), "Isosceles"));
        list.add(new Entrada(new Triangulo(2,1,2), "Isosceles"));
        list.add(new Entrada(new Triangulo(2,2,1), "Isosceles"));

        list.add(new Entrada(new Triangulo(1,2,3), "Escaleno"));
        list.add(new Entrada(new Triangulo(3,2,1), "Escaleno"));
        list.add(new Entrada(new Triangulo(2,3,1), "Escaleno"));
        list.add(new Entrada(new Triangulo(1,3,2), "Escaleno"));
        list.add(new Entrada(new Triangulo(2,1,3), "Escaleno"));

        list.add(new Entrada(new Triangulo(2,1,-3), "Excepción"));





        try {
            System.out.print("Ingrese lado 1: ");
            l1 = ScannerUtils.leerEntrada();
            System.out.println("");

            System.out.print("Ingrese lado 2: " );
            l2 = ScannerUtils.leerEntrada();
            System.out.println("");

            System.out.print("Ingrese lado 3: ");
            l3 = ScannerUtils.leerEntrada();
            System.out.println("");

            Triangulo t;

            t = new Triangulo(l1, l2, l3);
            System.out.println(t.obtenerTipoTriangulo());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
