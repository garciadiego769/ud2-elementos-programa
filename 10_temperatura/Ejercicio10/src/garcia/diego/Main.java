package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char respuesta;
        int grados;

        System.out.println("Introduce grados:");
        grados=Integer.parseInt(br.readLine());

        do{
            System.out.println("Introduce letra a convertir (F/K):");
            respuesta=br.readLine().charAt(0);
        }
        while (respuesta !='K' && respuesta!='F');

        double c;

        if(respuesta=='K'){
            c=grados+273.15;
            System.out.println(c +"grados Kelvin");
        }
        else {
            c=grados*1.8+32;
            System.out.println(c+"grados Fahrenheit");
        }

    }
}
