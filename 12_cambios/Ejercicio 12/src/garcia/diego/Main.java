package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double p;
        double c;
          System.out.println("Escribe el precio del producto: ");
            p=Double.parseDouble(br.readLine());

        do {
            System.out.println("Escribe la cantidad introducida: ");
            c=Double.parseDouble(br.readLine());
        }
        while (c<p || c%5!=0);

        if (c==p){
            System.out.println("Aqui tiene su producto");
        }
        else{
            /* hacemos la conversión de double a enteros*/
            int precio=(int)p;
            int cantidad=(int)c;

            int cambio=(cantidad-precio)*100;
            int monedas=cambio/200;
            System.out.println("Monedas de 2€ usadas: "+monedas);
            cambio=cambio%200;

            monedas=cambio/100;
            System.out.println("Monedas de 1€ usadas: "+monedas);
            cambio=cambio%100;

            monedas=cambio/50;
            System.out.println("Monedas de 50c usadas:"+monedas);
            cambio=cambio%50;

            monedas=cambio/20;
            System.out.println("Monedas de 20c usadas: "+monedas);
            cambio=cambio%20;

            monedas=cambio/10;
            System.out.println("Monedas de 10c usadas: "+monedas);
            cambio=cambio%10;

            monedas= cambio/5;
            System.out.println("Monedas de 5c usadas: "+monedas);
        }
    }
}
