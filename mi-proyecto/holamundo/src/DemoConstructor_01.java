public class DemoConstructor_01 {
    String atributo;
    double atributo2;
    public DemoConstructor_01(){
        System.out.println("Creando el objeto");
        atributo = "Valor inicializado";
    }
    public DemoConstructor_01(String value){
        atributo = value;
    }
    public DemoConstructor_01(String valor, double valor2){
        atributo = valor;
        atributo2 = valor2;

    }
}
