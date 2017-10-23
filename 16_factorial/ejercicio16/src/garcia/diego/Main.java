package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int multi=1;
        int a=2;

        System.out.println("Introduce nº:");
        numero=Integer.parseInt(br.readLine());

        do {
            multi=multi*a;
            a=a+1;
        } while (numero>=a);

        System.out.println("El factorial de "+numero+" es "+multi);

    }
}
