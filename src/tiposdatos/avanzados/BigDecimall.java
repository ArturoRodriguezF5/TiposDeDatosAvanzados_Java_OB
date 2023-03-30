package tiposdatos.avanzados;

import java.math.BigDecimal;

public class BigDecimall {
    public static void main(String[] args) {

        // Crear 2 bigDecimales
        BigDecimal bDec = new BigDecimal(5.12334d);
        BigDecimal bDec2 = new BigDecimal(0.122);

        // Operaciones más comunes con BigDecimal
        BigDecimal result = bDec.multiply(bDec2);
        System.out.println(result);
        System.out.println(bDec.intValue());
    }
}
