public class Manzana {
    private String color;
    private String dureza;
    private String tipoManz;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public String getTipoManz() {
        return tipoManz;
    }

    public void setTipoManz(String tipoManz) {
        this.tipoManz = tipoManz;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "color='" + color + '\'' +
                ", dureza='" + dureza + '\'' +
                ", tipoManz='" + tipoManz + '\'' +
                '}';
    }
}
