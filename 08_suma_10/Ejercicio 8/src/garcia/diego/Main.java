package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero= 0;
        int suma=0;
        for (int t = 0; t < 10; t++) {

            System.out.println("Introduce número: ");
            numero = Integer.parseInt(br.readLine());


            suma= suma+numero;
        }

        System.out.println("El resultado es: " + " " + suma);
    }
}
