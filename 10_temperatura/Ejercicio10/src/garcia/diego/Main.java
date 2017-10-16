package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introduce grados centigrados: ");
        int grados=Integer.parseInt(br.readLine());

        char b;
        do {
            System.out.println("Introduce la letra de conversión (K/F): ");
            b = br.readLine().charAt(0);
        } while (b!='K' || b!='F');

        double c;

            if (b=='K'){
                c=grados*1.8+32;
                System.out.println(c + ' ' + "grados kelvin" );
            }
            else {
                c=grados*1.8;
                System.out.println(c + ' ' + "grados kelvin" );
            }
        }
    }

