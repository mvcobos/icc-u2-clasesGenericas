public class Producto <N, P> {
    private N nombre;    
    private P precio;

    public Producto(N nombre, P precio){
        this.nombre = nombre;
        this.precio = precio;
    }   

    public N getNombre() {
        return nombre;
    }

    public void setNombre(N nombre) {
        this.nombre = nombre;
    }

    public P getPrecio() {
        return precio;
    }

    public void setPrecio(P precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", precio= " + precio;
    }


}
