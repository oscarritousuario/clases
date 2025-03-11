public class Profesionista {
    private String vocacion;
    private String equipoTrabajo;
    private String cortePelo;
    private String ingresoMensual;

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public String getEquipoTrabajo() {
        return equipoTrabajo;
    }

    public void setEquipoTrabajo(String equipoTrabajo) {
        this.equipoTrabajo = equipoTrabajo;
    }

    public String getCortePelo() {
        return cortePelo;
    }

    public void setCortePelo(String cortePelo) {
        this.cortePelo = cortePelo;
    }

    public String getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(String ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "vocacion='" + vocacion + '\'' +
                ", equipoTrabajo='" + equipoTrabajo + '\'' +
                ", cortePelo='" + cortePelo + '\'' +
                ", ingresoMensual='" + ingresoMensual + '\'' +
                '}';
    }
}
