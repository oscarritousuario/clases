public class Computadora {
    private String pantalla;
    private String tipoTeclado;
    private String raton;

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public String getRaton() {
        return raton;
    }

    public void setRaton(String raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "pantalla='" + pantalla + '\'' +
                ", tipoTeclado='" + tipoTeclado + '\'' +
                ", raton='" + raton + '\'' +
                '}';
    }
}
