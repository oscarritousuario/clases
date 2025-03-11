public class MAIN_PERSONA {
    public static void main(String[] args) {
        Persona p1 = new Persona(); //instanciamiento

        //Configurar el objeto dando valores
        p1.nombre="Leonardo";
        p1.genero="Masculino";
        p1.estatura=1.72;
        p1.peso=57;
        p1.edad=18;

        //Usando uno de los metodos
        System.out.println(p1.obtenerDatos());

        Persona p2 = new Persona();
        p2.nombre="Sebastian";
        p2.genero="Masculino";
        p2.estatura=1.98;
        p2.peso=80;
        p2.edad=19;
        String res=p2.obtenerDatos();
        System.out.println(res);

        System.out.println(p1.calcula_imc());
        System.out.println(p2.calcula_imc());

        Persona p3 = new Persona();
        p3.nombre="Helena";
        p3.genero="Femenino";
        p3.estatura=1.70;
        p3.peso=54;
        p3.edad=18;
        String res3=p3.obtenerDatos();
        System.out.println(res3);
        System.out.println(p3.calcula_imc());
    }
}
