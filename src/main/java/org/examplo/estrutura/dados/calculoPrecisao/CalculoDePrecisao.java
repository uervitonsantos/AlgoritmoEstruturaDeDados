package org.examplo.estrutura.dados.calculoPrecisao;

import java.math.BigDecimal;

public class CalculoDePrecisao {

    public static void main(String[] args) {

        double a = 0.34;
        double b = 0.25;
        double c = b - a;

        System.out.println("Resultado: " + c );

        BigDecimal d = new BigDecimal("0.34");
        BigDecimal e = new BigDecimal("0.25");
        BigDecimal f = e.subtract(d);

        System.out.println(f);
    }
}
