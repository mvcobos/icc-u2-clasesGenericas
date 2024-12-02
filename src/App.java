public class App {
    public static void main(String[] args) throws Exception {
        Producto <String, Integer> producto = new Producto<>("Mochila", 12);
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());

        producto.setNombre("Cartuchera");
        producto.setPrecio(5);

        System.out.println(producto);
    }
}
