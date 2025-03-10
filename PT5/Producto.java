package PT5;

public class Producto {
    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;

    public Producto(String nombre, String codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String  getNombre() {
        return this.nombre;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String  getCodigo() {
        return this.codigo;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int  getCantidad() {
        return this.cantidad;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public String toString(){
        return "| Producto" + this.nombre + "| Codigo" + this.codigo + "| Cantidad " + this.cantidad + "| Precio " + this.precio;
    }
}
