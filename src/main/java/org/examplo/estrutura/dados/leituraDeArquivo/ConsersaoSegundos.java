package org.examplo.estrutura.dados.leituraDeArquivo;

import java.util.Scanner;

public class ConsersaoSegundos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int segundos;

        System.out.println("Entre com um valor em segundos: ");
        segundos = scan.nextInt();


        int dias = segundos / 86400;
        segundos %= 86400;

        int horas = segundos / 3600;
        segundos %= 3600;

        int minutos = segundos / 60;
        segundos %= 60;

        System.out.print("Saída: ");

        if (dias > 0)
            System.out.printf(" %d dias", dias);
        if (horas > 0)
            System.out.printf(" %d horas", horas);
        if (minutos > 0)
            System.out.printf(" %d minutos", minutos);
        if (segundos > 0)
            System.out.printf(" %d segundos", segundos);
    }
}
