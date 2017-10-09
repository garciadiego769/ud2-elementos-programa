package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce número 1: ");
        int numero1 = Integer.parseInt(br.readLine()); /* en vez de declararla como texto la declaramos como entero y pasamos los datos a numericos con Integer... */

        System.out.print("Introduce número 2: ");
        int numero2 = Integer.parseInt(br.readLine());


        int operacion=numero1*numero2;

        System.out.print(operacion);

    }
}
