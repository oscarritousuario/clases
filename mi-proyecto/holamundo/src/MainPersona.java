public class MainPersona {
    public static void main(String[] args){
        Persona ObjetoPersona = new Persona(); //lo que estamos haciendo es una instancia
        ObjetoPersona.nombre = "Leonardo";
        ObjetoPersona.genero = "Masculino";
        ObjetoPersona.estatura = 1.72;
        ObjetoPersona.peso = 57;
        ObjetoPersona.edad = 18;
        //Usando uno de los metodos de la clase
        System.out.println(ObjetoPersona.obtenerDatos());

        Persona ObjPer2 = new Persona();
        ObjPer2.nombre = "Emiliano";
        ObjPer2.genero = "Masculino";
        ObjPer2.peso = 48;
        ObjPer2.estatura = 1.62;
        ObjPer2.edad = 18;

        String res = ObjPer2.obtenerDatos();
        System.out.println(res);

        System.out.println(ObjetoPersona.calcula_imc());
        System.out.println(ObjPer2.calcula_imc());

        Calificaiones boletilla = new Calificaiones();
        String call = boletilla.mostrarCalif();
        System.out.println(call);
        String semestre = boletilla.mostrarSemestre();
        System.out.println(semestre);
        String materias = boletilla.mostrarMateria();
        System.out.println(materias);
        System.out.println();

        Calificaiones boletilla2 = new Calificaiones();
        String call2 = boletilla2.mostrarCalif();
        System.out.println(call2);
        String semestre2 = boletilla2.mostrarSemestre();
        System.out.println(semestre2);
        String materias2 = boletilla2.mostrarMateria();
        System.out.println(materias2);
        System.out.println();

        Calificaiones boletilla3 = new Calificaiones();
        String call3 = boletilla3.mostrarCalif();
        System.out.println(call3);
        String semestre3 = boletilla3.mostrarSemestre();
        System.out.println(semestre3);
        String materias3 = boletilla3.mostrarMateria();
        System.out.println(materias3);
    }
}
