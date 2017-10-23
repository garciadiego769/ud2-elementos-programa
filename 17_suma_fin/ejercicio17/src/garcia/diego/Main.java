package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int suma=0;
        int max=-99999999;
        int min=99999999;
        String respuesta;

        System.out.println("Escribe nº o FIN:");
        respuesta=br.readLine();

      while (!respuesta.equalsIgnoreCase("FIN")){
         int respuesta1=Integer.parseInt(respuesta);
         suma=suma+respuesta1;

         if(respuesta1>max){
             max=respuesta1;
         }
         else if(respuesta1<min){
             min=respuesta1;
         }
       System.out.println("Escribe nº o FIN:");
       respuesta=br.readLine();
      }
           System.out.println("El resultado es "+suma);
           System.out.println("El máximo es "+max);
           System.out.println("El mínimo es "+min);

    }
}
