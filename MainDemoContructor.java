public class MainDemoContructor {
    public static void main(String[] args) {
        DemoConstructor_01 obj = new DemoConstructor_01();
        System.out.println(obj.atributo);
        obj.atributo = "valor nuevo";
        System.out.println(obj.atributo);

        DemoConstructor_01 obj2 = new DemoConstructor_01("Valor por defecto");

        DemoConstructor_01 obj3 = new DemoConstructor_01("23.3", 2.34){};
    }
}
