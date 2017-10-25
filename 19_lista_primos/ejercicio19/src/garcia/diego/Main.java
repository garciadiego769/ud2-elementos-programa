package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int respuesta;
        int t = 0;
        int x = 1;

        System.out.println("Introduce nº:");
        n = Integer.parseInt(br.readLine());


        for (int j = 1; j < n; j++) {

            int i = 2;
            while (j % i != 0 && i < j) {
                i = i + 1;
            }
            if (i < j) {
                //System.out.println("No primo");
            } else {
                System.out.println(j);
            }
        }






   /*
        while (respuesta >= t) {
            while (x % 1 == 0 && x % x == 0) {
                System.out.println("Nº primo:" + x);
            }
            t = t + 1;
        }*/

    }
}