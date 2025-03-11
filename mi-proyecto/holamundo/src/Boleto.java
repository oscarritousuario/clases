public class Boleto {
    private String fechaExp;
    private String tamaño;
    private String tipoPapel;
    private String serieNum;

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }

    public String getSerieNum() {
        return serieNum;
    }

    public void setSerieNum(String serieNum) {
        this.serieNum = serieNum;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "fechaExp='" + fechaExp + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", tipoPapel='" + tipoPapel + '\'' +
                ", serieNum='" + serieNum + '\'' +
                '}';
    }
}
