package com.unlam.utils;

import java.util.Scanner;

public class ScannerUtils {

    private static Scanner sc = new Scanner(System.in);

    public static int leerEntrada() throws Exception {
        int l;
        try {
            l = sc.nextInt();
        } catch(Exception e) {
            throw new Exception("No es un numero.");
        }
        return l;
    }

}
