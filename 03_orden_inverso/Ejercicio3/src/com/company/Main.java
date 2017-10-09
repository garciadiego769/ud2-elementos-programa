package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce número 1: ");
        int numero1 = Integer.parseInt(br.readLine());

        System.out.print("Introduce número 2: ");
        int numero2 = Integer.parseInt(br.readLine());

        System.out.print("Introduce número 3: ");
        int numero3 = Integer.parseInt(br.readLine());

        System.out.println(numero3 + " " + numero2 + " " + numero1);
    }
}