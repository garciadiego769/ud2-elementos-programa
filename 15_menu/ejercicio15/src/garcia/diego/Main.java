package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1;
        int num2;
        char respuesta;

        System.out.println("Introduce nº 1:");
        num1=Integer.parseInt(br.readLine());

        System.out.println("Introduce nº 2: ");
        num2=Integer.parseInt(br.readLine());

        /*Mostramos el menú */
        System.out.println("---");
        System.out.println("MENÚ");
        System.out.println("----");
        System.out.println("  ");
        System.out.println("a)Suma.");
        System.out.println("b)Resta.");
        System.out.println("c)Multiplicación.");
        System.out.println("d)División.");
        System.out.println("e)Resto.");
        System.out.println("f)Terminar.");
        System.out.println("  ");
        System.out.println("Introduzca una opción");

        respuesta=br.readLine().charAt(0);


        switch (respuesta){
            case 'a':
                int suma=num1+num2;
                System.out.println(num1+"+"+num2+"="+suma);
                break;
            case 'b':
                int resta=num1-num2;
                System.out.println(num1+"-"+num2+"="+resta);
                break;
            case 'c':
                int multiplicacion=num1*num2;
                System.out.println(num1+"*"+num2+"="+multiplicacion);
                break;
            case 'd':
                int division=num1/num2;
                System.out.println(num1+":"+num2+"="+division);
                break;
            case 'e':
                int resto=num1%num2;
                System.out.println("El resto de"+num1+"y"+num2+"es"+resto);
                break;
        }
    }
}
