public class Boleta {

    //atributos
    public String[] materia = {"POO", "Contabilidad", "Calculo", "Probabilidad",
            "Algebra", "Quimica"};
    public int semestre;
    public int no_control;
    public int[] calificacion;
    public String nombreEstudiante;

    //metodos
    public void mostrarBoleta(){
        /*hacer un ciclo que imprima las materias en orden descendente, el semestre
        * de forma descendente*/
        String materia1[] = this.materia;
        int grado = this.semestre;
        int noCtr = this.no_control;
        int calif[] = this.calificacion;

        int i;

        System.out.println(grado + " Numero de control: " + noCtr + "\n");
        for(i=0; i<=5; i++){
            System.out.print(materia1[i] + "     ");
        }
        System.out.println();
        for(i=0; i<=5; i++){
            System.out.print(calif[i] + "     ");
        }
        System.out.println();
    }
    public double calculaCalificacion(int calificacion){
        /* Calcular el promedio, imprimirlo y no retornar nada*/
        return 0.0;
    }
    //public

}
