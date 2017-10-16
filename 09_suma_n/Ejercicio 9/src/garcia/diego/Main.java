package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Cuántos valores deseas sumar?");
        int respuesta=Integer.parseInt(br.readLine());
        int suma=0;

        for (int t = 0; t < respuesta; t++) {
            System.out.println("Introduce valor:");
            int y= Integer.parseInt(br.readLine());
            suma=y+suma;
        }
        System.out.println("El resultado es:" +suma);
        }
}
