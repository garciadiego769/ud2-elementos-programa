package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce una base: ");
        double base=Double.parseDouble(br.readLine());

        System.out.println("Inntroduce una altura: ");
        double altura=Double.parseDouble(br.readLine());

        double area=(base*altura)/2;

        System.out.println("El área es: " + area);

    }
}
