package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int resto;
        char letra;

        do {
            System.out.println("Introduce el DNI sin letra:");
            numero = Integer.parseInt(br.readLine());

            System.out.println("Introduce letra:");
            letra = br.readLine().charAt(0);

            resto = numero % 23;
        } while (resto > 22);
            switch (resto) {
                case 0:
                    if (letra == 'T') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 1:
                    if (letra == 'R') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 2:
                    if (letra == 'W') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 3:
                    if (letra =='A') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 4:
                    if (letra == 'G') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 5:
                    if (letra == 'M') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 6:
                    if (letra == 'Y') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 7:
                    if (letra == 'F') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 8:
                    if (letra == 'P') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 9:
                    if (letra == 'D') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 10:
                    if (letra == 'X') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 11:
                    if (letra == 'B') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 12:
                    if (letra == 'N') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 13:
                    if (letra == 'J') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 14:
                    if (letra == 'Z') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 15:
                    if (letra == 'S') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 16:
                    if (letra == 'Q') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 17:
                    if (letra == 'V') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 18:
                    if (letra == 'H') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 19:
                    if (letra == 'L') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 20:
                    if (letra == 'C') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 21:
                    if (letra == 'K') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
                case 22:
                    if (letra == 'E') {
                        System.out.println("DNI correcto");
                    } else {
                        System.out.println("DNI incorrecto");
                    }
                    break;
            }
        }
    }

