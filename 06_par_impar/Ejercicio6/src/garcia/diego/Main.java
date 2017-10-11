package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un número: ");
        int numero=Integer.parseInt(br.readLine());

        if (numero%2==0){
            System.out.println("Es PAR");
        }
        else {
            System.out.println("Es IMPAR");
        }
    }
}
