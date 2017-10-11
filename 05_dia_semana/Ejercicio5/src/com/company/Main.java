package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un número entre 1-7: ");
        int numero = Integer.parseInt(br.readLine());


            switch (numero) {
                case 1:
                    System.out.println("Es lunes ");
                    break;
                case 2:
                    System.out.println("Es martes ");
                    break;
                case 3:
                    System.out.println("Es miércoles ");
                    break;
                case 4:
                    System.out.println("Es jueves");
                    break;
                case 5:
                    System.out.println("Es viernes");
                    break;
                case 6:
                    System.out.println("Es sábado");
                    break;
                case 7:
                    System.out.println("Es domingo");
                    break;
                default:

                    System.out.println("Número erróneo");
                    System.out.println("Introduce un número entre 1-7: ");
                    numero = Integer.parseInt(br.readLine());
                    break;
            }

        }

    }

