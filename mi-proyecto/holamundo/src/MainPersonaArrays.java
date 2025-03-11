import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonaArrays {
    public static void main(String[] args) {
        Persona p = new Persona();
        ArrayList<String> lista = new ArrayList<>();

        String frase = "Feliz san Valentin";
        lista.add(frase);

        frase = "Que se resivan muchos aplausos";
        lista.add(frase);

        frase = "Sera un buen dia";
        lista.add(frase);

        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        if (lista.contains(frase)){
            System.out.println("Tristemente asi sera");
        }else{
            System.out.println("GGs compadres");
        }

        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        while (bandera){
            System.out.println("Dame una frase");
            frase = teclado.nextLine();
            if (frase.equals("quit")) {
                bandera = false;
                lista.add(frase);
                break;
            }
        }
        for (String s: lista){
            System.out.println(s);
        }
    }
}
