import org.w3c.dom.ls.LSOutput;

public class DemoString {
    public static void main(String[] args) {
        String nombre = new String("Shakira");
        // codigo
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.length());
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        /* Crear una rutina para dad una frase, buscar si esxiste la palabra */
        String frase = "Leon anda en busca del amor";
        String[] resultado = frase.split(" ");
        for (String s : resultado) {
            System.out.println(s);
        }

        //Scanner scaneo = new Scanner(System.in);
        //String frase = "";

        String frase2 = "El amor es una magia, una simple fantasia";
        boolean amor = frase2.contains("amor");

        if(amor){
            System.out.println("La frase contiene la palabra amor");
        }

        //for (String s2:res){

        //};
        //String [] res2 = frase2.split("amor");
    /*for (String s2:res2){
        System.out.println(s2);
    }*/
    }
}
