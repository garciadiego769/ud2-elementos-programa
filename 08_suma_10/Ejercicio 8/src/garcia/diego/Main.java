package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=0;
        int numero= 0;
        int suma=0;
       do{
            System.out.println("Introduce número: ");
            numero = Integer.parseInt(br.readLine());


            suma= suma+numero;
            t=t+1;
        }
        while(t<10);

        System.out.println("El resultado es: " + " " + suma);
    }
}
