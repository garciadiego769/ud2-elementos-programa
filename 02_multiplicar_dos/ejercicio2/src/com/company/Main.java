package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.out.println("Introduce el número 1:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numero1 = br.readLine();

        System.out.println("Escribe el número 2:");
        String numero2=br.readLine();

        System.out.println(numero1  numero2);



    }
}
