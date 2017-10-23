package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char tipo;
        int n;

        do {
            System.out.println("Elige par o impar (P/I)");
            tipo = br.readLine().charAt(0);

        } while (tipo != 'P' && tipo != 'I');

        if (tipo == 'P') {
            n = 2;
        } else {
            n = 1;
        }

        for (int t = 0; t < 100; t++) {
            System.out.println(n);
            n = n + 2;
        }

    }
}
