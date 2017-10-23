package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int respuesta;
        int i=2;

        System.out.println("Introduce número:");
        respuesta=Integer.parseInt(br.readLine());

        while(respuesta%i!=0 && i<respuesta){
            i=i+1;
        }
        if(i<respuesta){
            System.out.println("No primo");
        }
        else{
            System.out.println("Primo");
        }

    }
}
