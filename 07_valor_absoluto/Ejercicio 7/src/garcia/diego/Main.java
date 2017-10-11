package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un número");
        int numero=Integer.parseInt(br.readLine());

        while (numero!=0){
            if(numero <0){
                int operacion=numero*(-1);
                System.out.println("Valor absouluto: " + operacion);
            }
            else{
                System.out.println("Valor absoluto: " +numero);
            }

            System.out.println("Introduce un número");
            numero=Integer.parseInt(br.readLine());
        }
    }
}
