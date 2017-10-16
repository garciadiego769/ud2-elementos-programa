package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int aleatorio= r.nextInt(100);
        int respuesta;

        do{
            System.out.println("Escribe nº o fin:" );
            respuesta=Integer.parseInt(br.readLine());
            System.out.println(aleatorio);
            if (respuesta>aleatorio){
                System.out.println("El número es menor que "+respuesta);
            }
            if (respuesta<aleatorio){
                System.out.println("El número es mayor que "+respuesta);
            }

        }
        while (respuesta!=aleatorio);
        if (respuesta == aleatorio){
            System.out.println("¡Has acertado! el número es "+respuesta);
        }
    }
}
