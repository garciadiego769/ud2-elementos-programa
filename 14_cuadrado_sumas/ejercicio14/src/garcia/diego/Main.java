package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valor;
        int acumula=0;

        System.out.println("Introduce valor:");
        valor=Integer.parseInt(br.readLine());

        for (int t = 0; t < valor; t++) {
            acumula=acumula+valor;
        }
        System.out.println("El cuadradado de "+valor+" es: "+acumula);
    }
}
