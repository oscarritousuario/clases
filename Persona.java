public class Persona {
    String nombre;
    int edad;
    double estatura;
    double peso;

    String genero;

    public double calcula_imc(){
        return peso/(estatura*estatura);
    }
    String obtenerDatos(){
        String cadena = "";
        cadena = cadena + "Persona {nombre: "+ nombre + "; ";
        cadena = cadena + "edad: " + edad + "; ";
        cadena = cadena + "estatura: " + estatura + "; ";
        cadena = cadena + "peso: " + peso + "; ";
        cadena = cadena + "genero: " + genero + "; ";
        return cadena;
    }
}
