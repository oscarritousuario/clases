public class Mouse {
    //atributos
    //encapsulado

    private String marca;
    private String tipo_conexion;
    private double precio;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_conexion() {
        return tipo_conexion;
    }

    public void setTipo_conexion(String tipo_conexion) {
        this.tipo_conexion = tipo_conexion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "marca='" + marca + '\'' +
                ", tipo_conexion='" + tipo_conexion + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Mouse (String marca, String tipo_conexion, double precio){
        this.marca = marca;
        this.tipo_conexion=tipo_conexion;
        this.precio=precio;
    }
    public Mouse (String marca, double precio){
        this.marca=marca;
        this.precio=precio;
    }
    public Mouse (double precio, String tipo_conexion){
        this.precio=precio;
        this.tipo_conexion=tipo_conexion;
    }
    public Mouse (String marca, String tipo_conexion){
        this.marca=marca;
        this.tipo_conexion=tipo_conexion;
    }
}
