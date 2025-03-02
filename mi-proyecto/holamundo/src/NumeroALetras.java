/*public class NumeroALetras {
    private final int numero;

    //Constructor de la clase
    public NumeroALetras(int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 9999");
        }
        this.numero = numero;
    }

    //metodo que hace que el numero ingresado se convierta a letra
    public String convertir() {

        //le decimos si el numero es 0, entonces retornamos la palabra cero
        if (numero == 0) return "cero";

        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veinitiseis", "veintisiete", "veintiocho", "veintinueve", "treintaiuno"};

        int num = numero;
        String resultado = "";

        // Millares
        int millar = num / 1000;
        if (millar > 0) {
            resultado += millar == 1 ? "mil" : unidades[millar] + " mil";
            num %= 1000;
        }

        // Centenas
        int centena = num / 100;
        if (centena > 0) {
            if (num == 100) {
                resultado += " cien";
            } else {
                resultado += " " + centenas[centena];
            }
            num %= 100;
        }

        // Decenas y unidades
        if (num > 0) {
            if (num < 10) {
                resultado += " " + unidades[num];
            } else if (num >= 10 && num < 31) {
                resultado += " " + especiales[num - 10];
            } else {
                int decena = num / 10;
                int unidad = num % 10;
                resultado += " " + decenas[decena];
                if (unidad > 0) {
                    resultado += " y " + unidades[unidad];
                }
            }
        }

        return resultado.trim().replaceAll(" +", " ");
    }

    public static void main(String[] args) {
        NumeroALetras conversor = new NumeroALetras(888);
        System.out.println(conversor.convertir()); // "mil doscientos treinta y cuatro"
    }
}*/
import java.util.Scanner;

public class NumeroALetras {
    private final int numero;

    public NumeroALetras(int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 9999");
        }
        this.numero = numero;
    }

    public String convertir() {
        //le decimos si el numero es 0, entonces retornamos la palabra cero
        if (numero == 0) return "cero";

        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veinitiseis", "veintisiete", "veintiocho", "veintinueve", "treintaiuno"};

        int num = numero;
        String resultado = "";

        // Millares
        int millar = num / 1000;
        if (millar > 0) {
            resultado += millar == 1 ? "mil" : unidades[millar] + " mil";
            num %= 1000;
        }

        // Centenas
        int centena = num / 100;
        if (centena > 0) {
            if (num == 100) {
                resultado += " cien";
            } else {
                resultado += " " + centenas[centena];
            }
            num %= 100;
        }

        // Decenas y unidades
        if (num > 0) {
            if (num < 10) {
                resultado += " " + unidades[num];
            } else if (num >= 10 && num < 31) {
                resultado += " " + especiales[num - 10];
            } else {
                int decena = num / 10;
                int unidad = num % 10;
                resultado += " " + decenas[decena];
                if (unidad > 0) {
                    resultado += " y " + unidades[unidad];
                }
            }
        }

        return resultado.trim().replaceAll(" +", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número (0-9999): ");
            int num = scanner.nextInt();

            NumeroALetras conversor = new NumeroALetras(num);
            System.out.println("Número en letras: " + conversor.convertir());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}