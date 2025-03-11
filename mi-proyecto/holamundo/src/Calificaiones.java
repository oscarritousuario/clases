import java.util.Scanner;

public class Calificaiones {
    public int semestre;
    public int calificacion;
    public String materia;


    public String mostrarCalif(){
        Scanner var_consl = new Scanner(System.in);
        int calif = this.calificacion;
        System.out.println("Ingresa tu calificación");
        calif = var_consl.nextInt();
        return "Tu calificaión es: " + calif;
    }
    public String mostrarSemestre(){
        Scanner var_consl = new Scanner(System.in);
        int semestre = this.semestre;
        System.out.println("Ingresa tu semestre");
        semestre = var_consl.nextInt();
        return "Tu semestre es: " + semestre;
    }
    public String mostrarMateria(){
        Scanner var_consl = new Scanner(System.in);
        String materia = this.materia;
        System.out.println("Ingresa tu materia");
        materia = var_consl.nextLine();
        return "Tu materia es: " + materia;
    }


}
