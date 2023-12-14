package org.examplo.estrutura.dados.leituraDeArquivo;

import java.util.Scanner;

public class Intercalacao {
    public static void main(String[] args) {

        String x = "abc";
        String y = "def";
        String q = x + y;
        String z;

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor de Z: ");
        z = scan.next();

        if (z.equalsIgnoreCase(q)) {
            System.out.println("Validas: " + z);
        }else {
            System.out.println("Invalidas: " + z);
        }

    }
}
