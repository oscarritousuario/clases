public class Balon {
    private String calidad;
    private String materialFab;
    private String claseBalon;

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getMaterialFab() {
        return materialFab;
    }

    public void setMaterialFab(String materialFab) {
        this.materialFab = materialFab;
    }

    public String getClaseBalon() {
        return claseBalon;
    }

    public void setClaseBalon(String claseBalon) {
        this.claseBalon = claseBalon;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "calidad='" + calidad + '\'' +
                ", materialFab='" + materialFab + '\'' +
                ", claseBalon='" + claseBalon + '\'' +
                '}';
    }
}
